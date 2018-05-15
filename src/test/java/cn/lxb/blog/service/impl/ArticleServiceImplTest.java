package cn.lxb.blog.service.impl;

import cn.lxb.blog.BlogApplication;
import cn.lxb.blog.model.Article;
import cn.lxb.blog.model.ArticleExample;
import cn.lxb.blog.service.ArticleService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * <p>
 * Description：文章管理服务接口测试
 * </P>
 *
 * @author Andy
 * @apiNote 知识改变命运，技术改变世界！
 * @since 2017-09-13 09:00.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BlogApplication.class)
public class ArticleServiceImplTest {

    @Resource
    private ArticleService articleService;

    private Logger logger = LoggerFactory.getLogger(ArticleServiceImplTest.class);

    @Test
    public void queryByCondition() throws Exception {
        ArticleExample example = new ArticleExample();
        PageInfo<Article> articlePageInfo = articleService.queryByCondition(example,1);
        logger.info("{}", articlePageInfo);
    }

}