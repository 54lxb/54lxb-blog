package cn.lxb.blog.web;

import cn.lxb.blog.model.Article;
import cn.lxb.blog.model.ArticleExample;
import cn.lxb.blog.service.ArticleService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

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

    /**
     * <p>
     *     Description：初始化博客首页信息
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
     *
     * <p>
     *     Description：初始化博客首页信息
     * </p>
     *
     * @param articleId 文章Id
     * @param model Model
     * @return  String
     * @author Andy
     * @apiNote 知识改变命运，技术改变世界！
     * @since 2017-09-13 09:00.
     */
    @GetMapping(value = "/details/{articleId}")
    public String findArticleById(@PathVariable("articleId") Integer articleId, Model model) {
        Article article = articleService.findArticleById(articleId);
        model.addAttribute("article", article);
        return "fore/index";
    }
}
