package cn.lxb.blog;

import cn.lxb.blog.model.Article;
import cn.lxb.blog.model.ArticleExample;
import cn.lxb.blog.service.ArticleService;
import com.github.pagehelper.PageInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;

/**
 * <p>
 * Description：自定义认证器
 * </P>
 *
 * @author Andy
 * @apiNote 知识改变命运，技术改变世界！
 * @since 2017-09-13 09:00.
 */
@Controller
@SpringBootApplication
@MapperScan("cn.lxb.blog.mapper")
public class BlogApplication {

    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        ArticleExample example = new ArticleExample();
        PageInfo<Article> articlePageInfo = articleService.queryByCondition(example, 1);
        model.addAttribute("articlePageInfo", articlePageInfo);
        return "fore/index";
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
