package com.lagou.dao;

import com.lagou.domain.ResourceCategory;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/18 22:23
 * @description
 */
public interface ResourceCategoryMapper {

    /*
        查询所有资源分类
     */
    public List<ResourceCategory> findAllResourceCategory();

}
