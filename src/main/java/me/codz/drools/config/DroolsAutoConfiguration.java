package me.codz.drools.config;

import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.conf.MBeansOption;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.spring.KModuleBeanFactoryPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * <p>Created with IDEA
 * <p>Author: dukang.liu
 * <p>Date: 2017/10/25
 * <p>Time: 17:17
 * <p>Version: 1.0
 */
@Configuration
public class DroolsAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(KieContainer.class)
    public KieContainer kieContainer() throws IOException {
        return getKieServices().getKieClasspathContainer();
    }

    @Bean
    public KieBase bookKieBase() throws IOException {
        KieBaseConfiguration kieBaseConf = getKieServices().newKieBaseConfiguration();
        kieBaseConf.setOption(MBeansOption.ENABLED);
        KieBase kieBase = kieContainer().newKieBase("BookKB", kieBaseConf);
        return kieBase;
    }

    @Bean(name = "bookKieSession")
    public KieSession bookKieSession() throws IOException {
        return bookKieBase().newKieSession();
    }


    @Bean
    public KieBase mobileKieBase() throws IOException {
        KieBaseConfiguration kieBaseConf = getKieServices().newKieBaseConfiguration();
        kieBaseConf.setOption(MBeansOption.ENABLED);
        KieBase kieBase = kieContainer().newKieBase("MobileKB", kieBaseConf);
        return kieBase;
    }

    @Bean(name = "mobileKieSession")
    public KieSession mobileKieSession() throws IOException {
        return mobileKieBase().newKieSession();
    }

    @Bean
    @ConditionalOnMissingBean(KModuleBeanFactoryPostProcessor.class)
    public KModuleBeanFactoryPostProcessor kiePostProcessor() {
        return new KModuleBeanFactoryPostProcessor();
    }

    private KieServices getKieServices() {
        return KieServices.Factory.get();
    }
}
