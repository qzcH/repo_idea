package com.lagou.domain;

/**
 * @author LH
 * @date 2021/1/17 18:54
 * @description
 */
public class PromotionAdVO {

    // 当前页
    private Integer currentPage;

    // 每页显示的条数
    private Integer pageSize;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
