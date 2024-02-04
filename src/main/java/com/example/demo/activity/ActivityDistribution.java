package com.example.demo.activity;

import com.example.demo.activity.actuator.interfaze.AbsActivityActuators;
import com.example.demo.activity.annotation.Activity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : songtc
 * @since : 2024/02/04 10:50
 * <p>
 * 活动分发器
 */
@Slf4j
@Component
public class ActivityDistribution implements ApplicationContextAware {

    /**
     * Map<活动id,活动执行器>
     */
    private static Map<Integer, AbsActivityActuators> map;

    /**
     * 活动执行器调用入口
     *
     * @param activityId 活动id
     * @param orderInfo  订单信息
     * @return 执行结果
     */
    public static Boolean doActuators(Integer activityId, Object orderInfo) {
        return ActivityDistribution.map.get(activityId).activityActuator(activityId, orderInfo);
    }

    /**
     * 初始化执行器map数据
     *
     * @param applicationContext ApplicationContext
     * @throws BeansException BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, AbsActivityActuators> actuators = applicationContext.getBeansOfType(AbsActivityActuators.class);

        map = new HashMap<>();
        // 填充执行器
        for (AbsActivityActuators actuator : actuators.values()) {
            Activity anno = actuator.getClass().getAnnotation(Activity.class);
            map.put(anno.id(), actuator);
            log.info("活动id为:{} 的执行器 {} 已装配", anno.id(), actuator.getClass().getSimpleName());
        }
        log.info("活动执行器装配完成 共计: {} 个", map.size());
    }
}
