package cn.lxb.blog.mapper;

import cn.lxb.blog.config.BaseMapper;
import cn.lxb.blog.model.Article;
import org.apache.ibatis.annotations.Param;

public interface ArticleMapper extends BaseMapper<Article> {

    Article findArticleById(@Param("articleId") Integer articleId);

    Article getLastArticle(@Param("articleId") Integer articleId);

    Article getNextArticle(@Param("articleId") Integer articleId);

    void addArticleCount(@Param("articleId") Integer articleId);
}