package com.aaa.creator.mapper;

import com.aaa.creator.entity.Product;
import com.aaa.creator.entity.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodInfoMapper {
    public List<ProductVO> findProductInfo();
    public int ProductCount();
}
