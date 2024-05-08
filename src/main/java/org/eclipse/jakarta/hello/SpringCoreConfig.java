package org.eclipse.jakarta.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCoreConfig {
    @Bean
    //@Bean(name={"helloSpringBean"})
    public HelloSpringBean helloSpringBean() {
        return new HelloSpringBeanImpl();
    }
}
