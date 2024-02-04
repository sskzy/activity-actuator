package com.example.demo.service.impl;

import com.example.demo.service.RaffleActivityService;
import org.springframework.stereotype.Service;

/**
 * @author : songtc
 * @since : 2024/02/04 11:12
 */
@Service
public class RaffleActivityServiceImpl implements RaffleActivityService {

    @Override
    public void sayHello(Object orderInfo) {
        System.out.println("Hello " + orderInfo);
    }
}
