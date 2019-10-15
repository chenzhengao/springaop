import com.czg.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-aop
 * @description:
 * @author: czg
 * @create: 2019-10-05 22:52
 */
public class SpringAopTest {

    @Test
    public void aopTest(){
        //读取应用上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserService userService = (UserService)context.getBean("UserService");

        userService.add(1);
    }
}
