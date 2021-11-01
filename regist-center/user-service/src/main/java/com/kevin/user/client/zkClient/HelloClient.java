package com.kevin.user.client.zkClient;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
@FeignClient(name = "zkClient")
public interface HelloClient {

    @RequestMapping(method = RequestMethod.GET, value = "/world")
    String world();

    @RequestMapping(method = RequestMethod.GET, value = "/listService")
    List<ServiceInstance> listService(@RequestParam("serviceName")String serviceName);

    @RequestMapping(method = RequestMethod.GET, value = "/listString")
    List<String> listString(@RequestParam("serviceName")String serviceName);

}
