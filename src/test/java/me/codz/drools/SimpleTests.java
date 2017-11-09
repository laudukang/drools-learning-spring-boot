package me.codz.drools;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

/**
 * <p>Created with IDEA
 * <p>Author: dukang.liu
 * <p>Date: 2017/10/26
 * <p>Time: 17:13
 * <p>Version: 1.0
 */
public class SimpleTests {

    @Test
    public void testContainer() {
        KieServices kieServices = KieServices.Factory.get();

        KieContainer kieContainer = kieServices.getKieClasspathContainer();

        System.out.println();
    }
}
