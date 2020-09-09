package com.fruits.mbg;

import com.fruits.mbg.config.MyBatisPlusGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes={MyBatisPlusGenerator.class})
class MbgApplicationTests {

    @Autowired
    private MyBatisPlusGenerator myBatisPlusGenerator;

    @Test
    void contextLoads() {
        myBatisPlusGenerator.generator();
    }

}
