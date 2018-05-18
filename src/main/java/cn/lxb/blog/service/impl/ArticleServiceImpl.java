package cn.lxb.blog.service.impl;

import cn.lxb.blog.mapper.ArticleMapper;
import cn.lxb.blog.model.Article;
import cn.lxb.blog.model.ArticleExample;
import cn.lxb.blog.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * Description：文章管理服务
 * </P>
 *
 * @author Andy
 * @apiNote 知识改变命运，技术改变世界！
 * @since 2017-09-13 09:00.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public PageInfo<Article> queryByCondition(ArticleExample example, Integer currentPageNum) {
        currentPageNum = null == currentPageNum ? 1 : currentPageNum;
        PageHelper.startPage(currentPageNum, 10);
        List<Article> articleList = articleMapper.selectByExample(example);
        return new PageInfo<>(articleList);
    }

    @Override
    public Article findArticleById(Integer articleId) {
        articleMapper.addArticleCount(articleId);
        return articleMapper.findArticleById(articleId);
    }

    @Override
    public List<Article> queryArticles() {
        return articleMapper.selectAll();
    }

    @Override
    public Article getLastArticle(Integer articleId) {
        return articleMapper.getLastArticle(articleId);
    }

    @Override
    public Article getNextArticle(Integer articleId) {
        return articleMapper.getNextArticle(articleId);
    }
}
