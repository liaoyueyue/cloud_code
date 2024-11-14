package com.product.mapper;

import com.product.model.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-10-31
 * Time: 14:32
 */
@Mapper
public interface ProductMapper {
    @Select("select * from product_detail where id = #{productId}")
    ProductInfo selectProductById(Integer productId);
}
