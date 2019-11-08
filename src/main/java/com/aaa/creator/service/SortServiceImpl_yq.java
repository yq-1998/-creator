package com.aaa.creator.service;

import com.aaa.creator.entity.Sort;
import com.aaa.creator.mapper.SortMapper_yq;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class SortServiceImpl_yq implements SortService_yq{
    @Resource
    private SortMapper_yq sortMapper_yq;
    @Override
    public List<Sort> selSort() {
        return sortMapper_yq.selSort();
    }
}
