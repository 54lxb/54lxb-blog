package cn.lxb.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>
 * Description：自定义认证器
 * </P>
 *
 * @author Andy
 * @apiNote 知识改变命运，技术改变世界！
 * @since 2017-09-13 09:00.
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("cn.lxb.blog.mapper")
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
