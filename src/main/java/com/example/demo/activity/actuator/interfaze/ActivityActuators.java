package com.example.demo.activity.actuator.interfaze;

/**
 * @author : songtc
 * @since : 2024/02/04 10:58
 * <p>
 * 活动执行器接口
 */
public interface ActivityActuators {
    /**
     * 活动执行器
     *
     * @param activityId 活动id
     * @param orderInfo  订单信息
     * @return 执行结果
     */
    Boolean activityActuator(Integer activityId, Object orderInfo);
}
