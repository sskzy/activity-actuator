package com.example.demo.activity.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : songtc
 * @since : 2024/02/04 11:12
 * <p>
 * 活动信息枚举
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
@Documented
public @interface Activity {
    /**
     * 活动id
     */
    int id();

    /**
     * 活动名称
     */
    String name();
}
