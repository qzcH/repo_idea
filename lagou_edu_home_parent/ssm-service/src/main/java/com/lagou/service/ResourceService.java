package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.Resource;
import com.lagou.domain.ResourceVo;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/18 22:07
 * @description
 */
public interface ResourceService {

    /*
        资源分页&多条件查询
     */
    public PageInfo<Resource> findAllResourceByPage(ResourceVo resourceVo);


}
