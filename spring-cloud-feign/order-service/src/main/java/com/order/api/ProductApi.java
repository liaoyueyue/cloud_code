package com.order.api;

import com.product.api.ProductInterface;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-11-09
 * Time: 14:08
 */
@FeignClient(value = "product-service", path = "/product")
public interface ProductApi extends ProductInterface {
}
