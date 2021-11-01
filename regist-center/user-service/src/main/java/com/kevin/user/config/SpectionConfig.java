package com.kevin.user.config;

import com.kevin.user.namefactory.Config1;
import com.kevin.user.namefactory.Config2;
import com.kevin.user.namefactory.SpeciationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@Configuration
public class SpectionConfig {


    @Bean
    public SpeciationConfig kevinConfig(){
    	SpeciationConfig speciationConfig =  new SpeciationConfig();
        speciationConfig.setName("kevin");
        speciationConfig.setConfiguration(new Class[]{Config1.class});
        return speciationConfig;
        
    }

    @Bean
    public SpeciationConfig pengxinConfig(){
        SpeciationConfig speciationConfig =  new SpeciationConfig();
        speciationConfig.setName("pengxin");
        speciationConfig.setConfiguration(new Class[]{Config2.class});
        return speciationConfig;

    }
}
