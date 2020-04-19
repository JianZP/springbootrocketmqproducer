package com.zj.shop.test;

import com.zj.shop.springboot.rocketmq.ProducerApplication;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProducerApplication.class)
@Slf4j
public class ProducerTest {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    @Test
    public void testSengMessage(){
        rocketMQTemplate.convertAndSend("SpringBoot-RocketMq","Hello SpringBoot-RocketMq");
    }
}
