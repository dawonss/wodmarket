package com.flab.wodmarket.domain.category;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class CategoryService {
    private final CategoryMapper categoryMapper;

    public List<String> allCategory() {
        return categoryMapper.allCategory();
    }

    public Category getCategory(int categoryNo) {
        return categoryMapper.getCategory(categoryNo);
    }


    public void addCategory(int categoryNo, String categoryName) {
        Category existCategory = getCategory(categoryNo);
        if (existCategory != null) {
            throw new IllegalArgumentException("CategoryID " + categoryNo + "가 이미 존재합니다.");
        }
        categoryMapper.addCategory(categoryNo, categoryName);
    }
}
