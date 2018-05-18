package cn.lxb.blog.listener;

import cn.lxb.blog.model.Article;
import cn.lxb.blog.service.ArticleService;
import cn.lxb.blog.service.BlogIndexService;
import cn.lxb.blog.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

/**
 * <p>
 * Description：
 * </P>
 *
 * @author Andy
 * @apiNote 知识改变命运，技术改变世界！
 * @since 2017-09-13 09:00.
 */
@WebListener
public class InitBlogListener implements ServletContextListener, ApplicationContextAware {

    private static ApplicationContext applicationContext;

    private Logger logger = LoggerFactory.getLogger(InitBlogListener.class);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        InitBlogListener.applicationContext = applicationContext;
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            ArticleService articleService = applicationContext.getBean("articleServiceImpl", ArticleService.class);
            BlogIndexService blogIndexService = applicationContext.getBean("blogIndexServiceImpl", BlogIndexService.class);
            List<Article> articles = articleService.queryArticles(); // 生成所有博客的索引
            for (Article article : articles) {
                if (null == article) {
                    continue;
                }
                blogIndexService.deleteIndex(String.valueOf(article.getId()));
                article.setDescription(StringUtil.deleteAllHTMLTag(article.getDescription()));
                blogIndexService.addIndex(article);
            }
            logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》ServletContex初始化");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》ServletContex销毁");
    }
}
