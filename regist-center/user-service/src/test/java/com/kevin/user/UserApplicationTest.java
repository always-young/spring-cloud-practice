package com.kevin.user;

import com.kevin.user.namefactory.MyNamedContextFactory;
import com.kevin.user.namefactory.User;
import com.kevin.user.qualifie.Client;
import com.kevin.user.qualifie.ReqFilter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.web.client.RestTemplate;
import sun.jvm.hotspot.interpreter.BytecodeNew;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    @ReqFilter
    private Client filterClient;

    @Autowired
    private Client myClient;

    @Test
    public void testNameContextFactory() throws Exception {
        final MyNamedContextFactory bean = applicationContext.getBean(MyNamedContextFactory.class);
        final User kevin = bean.getInstance("kevin", User.class);
        final User pengxin = bean.getInstance("pengxin", User.class);
        final RestTemplate restTemplate = bean.getInstance("kevin", RestTemplate.class);
        System.out.println(kevin);
        System.out.println(pengxin);
        System.out.println(restTemplate);
    }

    @Test
    public void testQualifier() throws Exception {
        System.out.println(filterClient.invoke("kevin love you"));
        System.out.println(myClient.invoke("kevin love you"));
    }


}