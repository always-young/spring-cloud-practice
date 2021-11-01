package com.kevin.register.zookeeper.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@RestController
@RequiredArgsConstructor
public class HelloController {

    private final DiscoveryClient discoveryClient;

    @GetMapping("world")
    public String world() {
        return System.getProperty("spring.profiles.active");
    }

    @GetMapping("listService")
    public List<ServiceInstance> listService(String serviceName) {
        return discoveryClient.getInstances(serviceName);
    }

    @GetMapping("listString")
    public List<String> listString(String serviceName) {
        List<String> objects = new ArrayList<>();
        objects.add(serviceName);
        objects.add("is");
        objects.add("ok");
        return objects;
    }

}
