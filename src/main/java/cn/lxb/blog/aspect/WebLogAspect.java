package cn.lxb.blog.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * <p>
 * Description：请求的日志处理
 * </P>
 *
 * @author Andy
 * @apiNote 知识改变命运，技术改变世界！
 * @since 2017-09-13 09:00.
 */
@Aspect
@Component
public class WebLogAspect {

    private static Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * cn.lxb.blog.web..*.*(..))")
    public void webLog() {
    }


    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {

        startTime.set(System.currentTimeMillis());

        //接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》URL : {}", request.getRequestURL());
        logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》SESSION : {}", request.getSession());
        logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》HTTP_METHOD : {}", request.getMethod());
        logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》IP_ADDRESS : {}", request.getRemoteAddr());
        logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》CLASS_METHOD : {}{}{}", joinPoint.getSignature().getDeclaringTypeName(), ".", joinPoint.getSignature().getName());
        logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》PARAMETERS : {}", Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》RESPONSE : {}", ret);
        logger.info("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》SPEND TIME : {}", (System.currentTimeMillis() - startTime.get()));
        startTime.remove(); //用完之后记得清除，不然可能导致内存泄露;
    }

}
