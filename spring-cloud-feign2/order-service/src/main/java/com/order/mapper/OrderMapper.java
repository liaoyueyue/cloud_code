package com.order.mapper;

import com.order.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-10-31
 * Time: 14:07
 */
@Mapper
public interface OrderMapper {
    @Select("select * from order_detail where id = #{orderId}")
    OrderInfo selectOrderById(Integer orderId);
}
