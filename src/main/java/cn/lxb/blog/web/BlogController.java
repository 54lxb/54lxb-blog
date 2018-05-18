package cn.lxb.blog.web;

import cn.lxb.blog.model.Article;
import cn.lxb.blog.model.ArticleExample;
import cn.lxb.blog.service.ArticleService;
import cn.lxb.blog.service.BlogIndexService;
import cn.lxb.blog.utils.StringUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * Description：文章视图控制器，数据展示管理
 * </P>
 *
 * @author Andy
 * @apiNote 知识改变命运，技术改变世界！
 * @since 2017-09-13 09:00.
 */
@Controller
@RequestMapping
public class BlogController {

    @Resource
    private ArticleService articleService;

    @Resource
    private BlogIndexService blogIndexService;

    /**
     * <p>
     * Description：初始化博客首页信息
     * </p>
     *
     * @param model Model
     * @return String
     * @author Andy
     * @apiNote 知识改变命运，技术改变世界！
     * @since 2017-09-13 09:00.
     */
    @RequestMapping(value = "/")
    public String index(Model model) {
        ArticleExample example = new ArticleExample();
        PageInfo<Article> articlePageInfo = articleService.queryByCondition(example, 1);
        model.addAttribute("articlePageInfo", articlePageInfo);
        return "fore/index";
    }

    /**
     * <p>
     * Description：查询博客文章详情，根据博文ID
     * </p>
     *
     * @param articleId 文章Id
     * @param model     Model
     * @return String
     * @author Andy
     * @apiNote 知识改变命运，技术改变世界！
     * @since 2017-09-13 09:00.
     */
    @GetMapping(value = "/article/details/{articleId}")
    public String findArticleById(@PathVariable("articleId") Integer articleId, Model model) {
        Article article = articleService.findArticleById(articleId);
        Article lastArticle = articleService.getLastArticle(articleId);
        Article nextArticle = articleService.getNextArticle(articleId);
        model.addAttribute("article", article);
        model.addAttribute("lastArticle",lastArticle);
        model.addAttribute("nextArticle",nextArticle);
        return "fore/article";
    }

    /**
     * <p>
     * Description：根据关键字查找博文
     * </p>
     *
     * @param Keyword 关键字
     * @return String
     * @author Andy
     * @apiNote 知识改变命运，技术改变世界！
     * @since 2017-09-13 09:00.
     */
    @RequestMapping(value = "/article/search")
    public String searchArticle(@RequestParam(value = "Keyword", required = false) String Keyword, Model model) {
        try {
            if (StringUtil.isEmpty(Keyword)) {
                List<Article> articles = articleService.queryArticles();
                model.addAttribute("articles", articles);
            } else {
                List<Article> articles = blogIndexService.searchArticle(Keyword);
                model.addAttribute("articles", articles);
            }
            return "fore/search";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
