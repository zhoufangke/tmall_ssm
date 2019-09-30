package com.how2java.tmall.pojo;

/**
 * 描述:
 *
 * @author 周方柯
 * @create 2019-09-27 17:09
 */
public class Category {
    private  int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name ==null?null : name.trim();
    }

}
