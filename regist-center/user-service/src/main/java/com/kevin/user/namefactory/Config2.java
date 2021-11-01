package com.kevin.user.namefactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@Configuration
public class Config2 {
    
    @Bean
    public User pengxin(){
    	User user =  new User();
        user.setName("pengxin");
        user.setAge(22);
        return user;
        
    }
}
