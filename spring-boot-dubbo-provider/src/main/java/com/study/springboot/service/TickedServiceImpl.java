package com.study.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ITickedService.class)
public class TickedServiceImpl implements ITickedService {
    @Override
    public void tick() {
        System.out.println("--------provider------start");
        System.out.println("买到了<流浪地球的>的票哦~~");
        System.out.println("--------provider------end");
    }
}
