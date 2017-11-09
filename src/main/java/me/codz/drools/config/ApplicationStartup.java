package me.codz.drools.config;

import me.codz.drools.service.UserService;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * <p>Created with IDEA
 * <p>Author: dukang.liu
 * <p>Date: 2017/10/26
 * <p>Time: 18:41
 * <p>Version: 1.0
 */
@Configuration
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private UserService userService;
    @Resource(name = "mobileKieSession")
    private KieSession mobileKieSession;
    @Resource(name = "bookKieSession")
    private KieSession bookKieSession;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        bookKieSession.setGlobal("userService", userService);
        mobileKieSession.setGlobal("userService", userService);
    }
}
