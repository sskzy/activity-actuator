package com.example.demo.service.impl;

import com.example.demo.service.InviteActivityService;
import org.springframework.stereotype.Service;

/**
 * @author : songtc
 * @since : 2024/02/04 14:33
 */
@Service
public class InviteActivityServiceImpl implements InviteActivityService {
    @Override
    public void sayByeBye(Object orderInfo) {
        System.out.println("ByeBye " + orderInfo);
    }
}
