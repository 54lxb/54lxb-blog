package cn.lxb.blog.service;

import cn.lxb.blog.model.Article;

import java.util.List;

/**
 * <P>
 *  Description：博客索引管理
 * </P>
 * @author Andy
 * @since 2017-09-13 09:00.
 * @apiNote 知识改变命运，技术改变世界！
 */
public interface BlogIndexService {

    /**
     * TODO 添加博客索引
     *
     * @param article 博客信息
     */
    public void addIndex(Article article) throws Exception;

    /**
     * TODO 更新博客索引
     *
     * @param article 博客信息
     */
    public void updateIndex(Article article) throws Exception;

    /**
     * TODO 删除指定博客的索引
     *
     * @param articleId 博客信息id
     */
    public void deleteIndex(String articleId) throws Exception;

    /**
     * TODO 查询博客信息
     *
     * @param keyword 查询关键字
     */
    public List<Article> searchArticle(String keyword) throws Exception;
}
