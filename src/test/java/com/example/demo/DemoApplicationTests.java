package com.example.demo;

import com.example.demo.activity.ActivityDistribution;
import com.example.demo.service.RaffleActivityService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Type;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        ActivityDistribution.doActuators(1, "Activity");
        ActivityDistribution.doActuators(2, "Activity");
    }
}
