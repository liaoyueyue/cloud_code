package com.order.controller;

import com.product.api.ProductApi;
import com.product.model.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-11-09
 * Time: 20:50
 */
@Slf4j
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    ProductApi productApi;

    /**
     * 远程调用访问商品服务p1
     *
     * @param id
     * @return
     */
    @RequestMapping("/o1")
    public String o1(Integer id, String userName) {
        log.info("接收到过滤器的添加的参数，username:{}", userName);
        return productApi.p1(id);
    }

    @RequestMapping("/o2")
    public String o2(Integer id, String name) {
        return productApi.p2(id, name);

    }

    @RequestMapping("/o3")
    public String o3() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setId(1);
        productInfo.setProductName("T恤白");
        return productApi.p3(productInfo);
    }

    @RequestMapping("/o4")
    public String o4() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setId(2);
        productInfo.setProductName("T恤黑");
        return productApi.p4(productInfo);
    }
}
