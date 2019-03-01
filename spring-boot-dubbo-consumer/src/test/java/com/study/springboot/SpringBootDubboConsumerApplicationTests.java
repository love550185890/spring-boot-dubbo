package com.study.springboot;

import com.study.springboot.service.ITickedService;
import com.study.springboot.service.MyConsumerService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDubboConsumerApplicationTests {

    @Autowired
    MyConsumerService consumerService;

    @Test
    public void contextLoads() {
        System.out.println("---test--->start");
        consumerService.maipiao();
        System.out.println("---test---->end");
    }

}
