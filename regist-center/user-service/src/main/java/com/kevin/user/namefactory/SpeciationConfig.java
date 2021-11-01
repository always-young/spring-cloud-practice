package com.kevin.user.namefactory;

import lombok.Setter;
import org.springframework.cloud.context.named.NamedContextFactory;

import java.util.List;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@Setter
public class SpeciationConfig implements NamedContextFactory.Specification {

    private Class<?>[] configuration;

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Class<?>[] getConfiguration() {
        return configuration;
    }
}
