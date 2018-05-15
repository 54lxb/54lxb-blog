package cn.lxb.blog.service;

import cn.lxb.blog.model.Article;
import cn.lxb.blog.model.ArticleExample;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * Description：文章管理服务接口
 * </P>
 *
 * @author Andy
 * @apiNote 知识改变命运，技术改变世界！
 * @since 2017-09-13 09:00.
 */
public interface ArticleService {

    /**
     * <p>
     *     Description：按照查询条件分页查询文章信息
     * </p>
     * @param example 查询条件
     * @param currentPageNum 当前页码
     * @return PageInfo<Article>
     */
    PageInfo<Article> queryByCondition(ArticleExample example, Integer currentPageNum);

    /**
     * <p>
     *     Description：根据文章ID查询文章详情
     * </p>
     *
     * @param articleId 文章Id
     * @return Article OR NULL
     */
    Article findArticleById(Integer articleId);

}
