package com.kevin.register.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ZkClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkClientApplication.class, args);
    }
}
