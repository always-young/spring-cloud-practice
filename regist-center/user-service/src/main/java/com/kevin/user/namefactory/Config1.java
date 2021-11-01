package com.kevin.user.namefactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@Configuration
public class Config1 {

    @Bean
    public User user(){
    	User user =  new User();
        user.setName("kevin");
        user.setAge(20);
        return user;

    }
}
