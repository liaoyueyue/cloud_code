package com.order.service;

import com.order.mapper.OrderMapper;
import com.order.model.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-10-31
 * Time: 14:10
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public OrderInfo selectOrderById(Integer orderId) {
        return orderMapper.selectOrderById(orderId);
    }
}
