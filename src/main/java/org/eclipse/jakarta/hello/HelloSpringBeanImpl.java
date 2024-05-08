package org.eclipse.jakarta.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSpringBeanImpl implements HelloSpringBean {
    private static final Logger logger = LoggerFactory.getLogger(HelloSpringBeanImpl.class);

    static {
        logger.warn("    ==============>  HelloSpringBeanImpl got static-created! ");
    }

    public HelloSpringBeanImpl() {
        logger.warn("    ==============>  HelloSpringBeanImpl got created! ");
    }

    public String getFancyGreeting() {
        return "┬┴┬┴┤･ω･)ﾉ├┬┴┬┴";
    }
}
