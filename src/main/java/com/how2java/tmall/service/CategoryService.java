package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

import java.util.List;

/**
 * 描述:
 *
 * @author 周方柯
 * @create 2019-09-27 17:19
 */
public interface CategoryService {
    int total();
    List<Category> list(Page page);
    void add(Category category);
}
