import com.czg.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-aop
 * @description: 自定义切面测试
 * @author: czg
 * @create: 2019-10-06 12:31
 */
public class DiyAdviceTest {


    @Test
    public void adviceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserService userService = (UserService)context.getBean("userService");

        userService.add(1);
    }
}
