package com.kevin.user.config;

import com.kevin.user.namefactory.DefaultConfig;
import com.kevin.user.namefactory.MyNamedContextFactory;
import com.kevin.user.namefactory.SpeciationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@Configuration
@AutoConfigureAfter(SpectionConfig.class)
public class UserConfig {

    @Autowired
    private List<SpeciationConfig> listSpeciationConfig;

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public MyNamedContextFactory myNamedContextFactory(){
        final MyNamedContextFactory myNamedContextFactory = new MyNamedContextFactory(DefaultConfig.class, "default", "default");
        myNamedContextFactory.setConfigurations(listSpeciationConfig);
        return myNamedContextFactory;
    }

}
