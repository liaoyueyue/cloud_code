package com.order.controller;

import com.order.model.OrderInfo;
import com.order.model.ProductInfo;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-10-31
 * Time: 14:12
 */
@Controller
@ResponseBody
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{orderId}")
    public OrderInfo getOrderById(@PathVariable("orderId") Integer orderId) {
        OrderInfo orderInfo = orderService.selectOrderById(orderId);
        String url = "http://product-service/product/" + orderInfo.getProductId();
        ProductInfo productInfo = restTemplate.getForObject(url, ProductInfo.class);
        orderInfo.setProductInfo(productInfo);
        return orderInfo;
    }
}
