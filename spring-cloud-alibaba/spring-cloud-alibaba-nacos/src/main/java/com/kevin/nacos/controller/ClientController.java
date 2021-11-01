package com.kevin.nacos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {

    private final DiscoveryClient discoveryClient;

    @GetMapping("discoveryClient")
    public List<ServiceInstance> listService(String serviceName) {
        return discoveryClient.getInstances(serviceName);
    }
    @GetMapping("getService")
    public List<String> getService() {
        return discoveryClient.getServices();
    }

}
