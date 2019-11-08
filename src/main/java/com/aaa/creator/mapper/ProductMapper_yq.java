package com.aaa.creator.mapper;

import com.aaa.creator.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper_yq {
    public List<Product> selPro();
    public List<Product> selproduct(Integer sid);
}
