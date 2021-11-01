package com.kevin.user.qualifie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@Configuration
public class MyClientConfig {

    @Bean
    @ReqFilter
    public Client filterClient(){
        return new Client();
    }

    @Bean
    public Client myClient(){
        return new Client();
    }
}
