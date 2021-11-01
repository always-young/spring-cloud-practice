package com.kevin.user.namefactory;

import org.springframework.cloud.context.named.NamedContextFactory;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */

public class MyNamedContextFactory extends NamedContextFactory<SpeciationConfig> {


    public MyNamedContextFactory(Class<?> defaultConfigType, String propertySourceName, String propertyName) {
        super(defaultConfigType, propertySourceName, propertyName);
    }
}
