package com.kevin.user.controller;

import com.kevin.user.client.zkClient.HelloClient;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final RestTemplate restTemplate;

    private final HelloClient helloClient;

    @GetMapping("hello")
    public String hello(){
       return restTemplate.getForObject("http://zkClient/world",String.class);
    }

    @GetMapping("world")
    public String world(){
        return helloClient.world();
    }

    @GetMapping("listService")
    public List<ServiceInstance> listService(String serviceName){
        return helloClient.listService(serviceName);
    }

    @GetMapping("listString")
    public List<String> listString(String serviceName){
        return helloClient.listString(serviceName);
    }



}
