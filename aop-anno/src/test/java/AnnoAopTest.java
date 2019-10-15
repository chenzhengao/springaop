import com.czg.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-aop
 * @description:
 * @author: czg
 * @create: 2019-10-06 13:19
 */
public class AnnoAopTest {


    @Test
    public void aopTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserService userService = (UserService)context.getBean("userService");

        userService.add(1);
    }
}
