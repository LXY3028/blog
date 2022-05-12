package com.hx.common.lang.vo;

import lombok.Data;

import java.util.List;

/**
 * 传给前端的分页视图对象
 *
 */
@Data
public class PageResult {
    private List<BlogInfo> records;
    private int total;
    private int size;
    private int current;
    private List<String> orders;
    private boolean searchCount;
    private int pages;


}
