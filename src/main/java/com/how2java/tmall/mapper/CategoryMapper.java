package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

import java.util.List;

/**
 * 描述:
 *
 * @author 周方柯
 * @create 2019-09-27 17:16
 */
public interface CategoryMapper {
    List<Category> list(Page page);
    List<Category> list();
    int total();
    void add(Category category);
}
