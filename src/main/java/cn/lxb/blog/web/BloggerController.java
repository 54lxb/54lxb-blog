package cn.lxb.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * Description：
 * </P>
 *
 * @author Andy
 * @apiNote 知识改变命运，技术改变世界！
 * @since 2017-09-13 09:00.
 */
@Controller
@RequestMapping(value = "/blogger")
public class BloggerController {

    /**
     * <p>
     * Description：博主关于我
     * </p>
     *
     * @return String
     * @author Andy
     * @apiNote 知识改变命运，技术改变世界！
     * @since 2017-09-13 09:00.
     */
    @RequestMapping(value = "/aboutMe")
    public String aboutMe() {
        return "fore/aboutMe";
    }

}
