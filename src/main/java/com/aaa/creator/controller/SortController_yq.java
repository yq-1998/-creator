package com.aaa.creator.controller;

import com.aaa.creator.entity.Sort;
import com.aaa.creator.service.SortService_yq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SortController_yq {
    @Autowired
    private SortService_yq sortService_yq;
    @ResponseBody
    @RequestMapping("selSort")
    public Object selSort(){
        List<Sort> sorts = sortService_yq.selSort();
        System.out.println(sorts);
        return sorts;
    }
}
