package com.aaa.creator.mapper;

import com.aaa.creator.entity.Sort;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SortMapper_yq {
   public List<Sort> selSort();
}
