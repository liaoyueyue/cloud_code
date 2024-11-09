package com.order.model;

import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-10-31
 * Time: 14:30
 */
@Data
public class ProductInfo {
    private Integer id;
    private String productName;
    private Integer productPrice;
    private Integer state;
    private Date createTime;
    private Date updateTime;
}
