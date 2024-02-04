package com.example.demo.activity.actuator;

import com.example.demo.activity.actuator.interfaze.AbsActivityActuators;
import com.example.demo.activity.annotation.Activity;
import com.example.demo.service.RaffleActivityService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : songtc
 * @since : 2024/02/04 11:25
 */
@Activity(id = 1, name = "抽奖活动Service")
public class RaffleActivityActuator extends AbsActivityActuators {

    @Resource
    private RaffleActivityService raffleActivityService;

    @Override
    public Boolean activityActuator(Integer activityId, Object orderInfo) {
        raffleActivityService.sayHello(orderInfo);
        return true;
    }
}
