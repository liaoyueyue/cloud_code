package com.order.controller;

import com.order.model.OrderInfo;
import com.order.model.ProductInfo;
import com.order.service.OrderService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-10-31
 * Time: 14:12
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    private AtomicInteger count = new AtomicInteger(1);

    private List<ServiceInstance> instances;

    @PostConstruct
    public void init() {
        // 从 Eureka 中获取服务列表
        instances = discoveryClient.getInstances("product-service");
    }

//    @RequestMapping("/{orderId}")
//    public OrderInfo getOrderById(@PathVariable("orderId") Integer orderId) {
//        OrderInfo orderInfo = orderService.selectOrderById(orderId);
////        String url = "http://localhost:9090/product/" + orderInfo.getProductId();
//        // 计算轮询的实例
//        int index = count.getAndIncrement() % instances.size();
//        String uri = instances.get(index).getUri().toString();
//        String url =  uri + "/product/" + orderInfo.getProductId();
//        log.info("远程调用为： "+url);
//        ProductInfo productInfo = restTemplate.getForObject(url, ProductInfo.class);
//        orderInfo.setProductInfo(productInfo);
//        return orderInfo;
//    }

    @RequestMapping("/{orderId}")
    public OrderInfo getOrderById(@PathVariable("orderId") Integer orderId) {
        OrderInfo orderInfo = orderService.selectOrderById(orderId);
        String url = "http://product-service/product/" + orderInfo.getProductId();  // 使用LoadBalance注解后，ip和端口号直接改成应用名
        log.info("远程调用为： "+url);
        ProductInfo productInfo = restTemplate.getForObject(url, ProductInfo.class);
        orderInfo.setProductInfo(productInfo);
        return orderInfo;
    }
}
