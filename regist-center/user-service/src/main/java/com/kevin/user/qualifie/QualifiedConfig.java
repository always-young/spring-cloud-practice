package com.kevin.user.qualifie;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@Configuration
public class QualifiedConfig {

    @Autowired(required = false)
    @ReqFilter
    private List<Client> clients;


    @Bean
    public Intercept intercept(){
        return new DefaultIntercept();
    }

    @Bean
    public SmartInitializingSingleton smartInitializingSingleton(Intercept intercept){
    	return () -> {
            for (Client client : QualifiedConfig.this.clients) {
                client.addIntercept(intercept);
            }
        };
    }
}
