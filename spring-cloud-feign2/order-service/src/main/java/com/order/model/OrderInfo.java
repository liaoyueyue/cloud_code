package com.order.model;

import com.product.model.ProductInfo;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-10-31
 * Time: 14:03
 */
@Data
public class OrderInfo {
    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer num;
    private Integer price;
    private Integer deleteFlag;
    private Date createTime;
    private Date updateTime;
    private ProductInfo productInfo;
}
