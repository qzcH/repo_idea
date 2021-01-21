package com.lagou.service.impl;

import com.lagou.dao.ResourceCategoryMapper;
import com.lagou.domain.ResourceCategory;
import com.lagou.service.ResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/18 22:32
 * @description
 */
@Service
public class ResourceCategoryServiceImpl implements ResourceCategoryService {

    @Autowired
    private ResourceCategoryMapper resourceCategoryMapper;

    @Override
    public List<ResourceCategory> findAllResourceCategory() {

        List<ResourceCategory> allResourceCategory = resourceCategoryMapper.findAllResourceCategory();
        return allResourceCategory;
    }
}
