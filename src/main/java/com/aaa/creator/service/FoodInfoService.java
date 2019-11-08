package com.aaa.creator.service;

import com.aaa.creator.entity.Product;
import com.aaa.creator.entity.ProductVO;

import java.util.List;

public interface FoodInfoService {
    public List<ProductVO> findProductInfo(int limit, int page);
    public int ProductCount();
}
