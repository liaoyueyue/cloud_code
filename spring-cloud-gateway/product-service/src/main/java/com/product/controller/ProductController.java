package com.product.controller;

import com.product.model.ProductInfo;
import com.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-10-31
 * Time: 14:37
 */
@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/{productId}")
    public ProductInfo getProductById(@PathVariable("productId") Integer productId) {
        log.info("接受参数，productId："+productId);
        return productService.selectProductById(productId);
    }

    @RequestMapping("/p1")
    public String p1(Integer id) {
        return "product-service 接收到参数，id:" + id;
    }

    @RequestMapping("/p2")
    public String p2(Integer id, String name) {
        return "product-service 接收到参数，id:" + id + " name: " + name;
    }

    @RequestMapping("/p3")
    public String p3(ProductInfo productInfo) {
        return "product-service 接收到参数，productInfo:" + productInfo.toString();
    }

    @RequestMapping("/p4")
    public String p4(@RequestBody ProductInfo productInfo) {
        return "product-service 接收到参数，productInfo:" + productInfo.toString();
    }
}
