package com.zzr.eureka_client_4_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo(){
        return this.discoveryClient.getInstances("");//这里填写提供服务名称 获取到他的
    }

}
