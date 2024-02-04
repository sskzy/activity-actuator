package com.example.demo.activity.actuator;

import com.example.demo.activity.actuator.interfaze.AbsActivityActuators;
import com.example.demo.activity.actuator.interfaze.ActivityActuators;
import com.example.demo.activity.annotation.Activity;
import com.example.demo.service.InviteActivityService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : songtc
 * @since : 2024/02/04 14:34
 */
@Activity(id = 2, name = "邀请活动Service")
public class InviteActivityActuator extends AbsActivityActuators {

    @Resource
    private InviteActivityService inviteActivityService;

    @Override
    public Boolean activityActuator(Integer activityId, Object orderInfo) {
        inviteActivityService.sayByeBye(orderInfo);
        return true;
    }
}
