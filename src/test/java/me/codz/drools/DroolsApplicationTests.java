package me.codz.drools;

import me.codz.drools.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.naming.NamingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DroolsApplicationTests {

    @Resource(name = "mobileKieSession")
    private KieSession mobileKieSession;
    @Resource(name = "bookKieSession")
    private KieSession bookKieSession;

    @Test
    public void contextLoads() {
    }


    @Test
    public void testHello() throws NamingException {
        User user = new User();
        user.setName("lau");

        bookKieSession.insert(user);
        bookKieSession.fireAllRules();
        bookKieSession.dispose();

        System.out.println("result: " + user.getName());
    }

}
