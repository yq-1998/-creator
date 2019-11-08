package com.aaa.creator.controller;

import com.aaa.creator.entity.Product;
import com.aaa.creator.service.ProductService_yq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController_yq {
    @Autowired
    private ProductService_yq productService_yq;
    @ResponseBody
    @RequestMapping("selPro")
    public Object selPro(){
        List<Product> pro = productService_yq.selPro();
        return pro;
    }
    @ResponseBody
    @RequestMapping("selProduct")
    public Object selProduct(Integer sid){
        List<Product> products = productService_yq.selproduct(sid);
        return products;
    }
}
