package com.flab.wodmarket.domain.category;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CategoryMapper {

    List<String> allCategory();

    void addCategory(int categoryNo, String categoryName);

    Category getCategory(int categoryNo);
}
