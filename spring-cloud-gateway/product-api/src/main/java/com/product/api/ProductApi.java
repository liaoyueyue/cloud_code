package com.product.api;

import com.product.model.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-11-09
 * Time: 14:08
 */
@FeignClient(value = "product-service", path = "/product")
public interface ProductApi {
    @RequestMapping("/{productId}")
    ProductInfo getProductInfo(@PathVariable Integer productId);

    @RequestMapping("/p1")
    String p1(@RequestParam Integer id);

    @RequestMapping("/p2")
    String p2(@RequestParam Integer id, @RequestParam String name);

    @RequestMapping("/p3")
    String p3(@SpringQueryMap ProductInfo productInfo);

    @RequestMapping("/p4")
    String p4(@RequestBody ProductInfo productInfo);
}
