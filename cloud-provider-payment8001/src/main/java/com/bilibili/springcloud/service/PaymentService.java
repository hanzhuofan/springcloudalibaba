package com.bilibili.springcloud.service;

import com.bilibili.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author hanzhuofan
 * @create 2020-7-5
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
