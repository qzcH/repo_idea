package com.lagou.service;

import com.lagou.domain.ResourceCategory;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/18 22:32
 * @description
 */
public interface ResourceCategoryService {

    /*
        查询所有资源分类
     */
    public List<ResourceCategory> findAllResourceCategory();

}
