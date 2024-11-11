package com.order.service;

import com.order.api.ProductApi;
import com.order.mapper.OrderMapper;
import com.order.model.OrderInfo;
import com.product.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductApi productApi;

    public OrderInfo selectOrderById(Integer orderId) {
        OrderInfo orderInfo = orderMapper.selectOrderById(orderId);
//        String url = "http://product-service/product/" + orderInfo.getProductId();
//        ProductInfo productInfo = restTemplate.getForObject(url, ProductInfo.class);
        ProductInfo productInfo = productApi.getProductById(orderInfo.getProductId());
        orderInfo.setProductInfo(productInfo);
        return orderInfo;
    }
}
