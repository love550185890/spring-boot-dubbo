package com.study.springboot.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class MyConsumerService {
    @Reference
    ITickedService tickedService;
     public void maipiao(){
         System.out.println("-------------->consumer-----start");
         tickedService.tick();
         System.out.println("-------------->consumer-----end");
     }
}
