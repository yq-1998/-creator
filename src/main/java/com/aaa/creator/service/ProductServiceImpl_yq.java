package com.aaa.creator.service;

import com.aaa.creator.entity.Product;
import com.aaa.creator.mapper.ProductMapper_yq;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class ProductServiceImpl_yq implements ProductService_yq{
    @Resource
    private ProductMapper_yq productMapper_yq;

    @Override
    public List<Product> selPro() {
        return productMapper_yq.selPro();
    }

    @Override
    public List<Product> selproduct(Integer sid) {
        return productMapper_yq.selproduct(sid);
    }
}
