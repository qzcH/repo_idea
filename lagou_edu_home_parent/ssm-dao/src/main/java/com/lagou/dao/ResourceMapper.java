package com.lagou.dao;

import com.lagou.domain.Resource;
import com.lagou.domain.ResourceVo;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/18 21:58
 * @description
 */
public interface ResourceMapper {

    /*
        资源分页&多条件查询
     */
    public List<Resource> findAllResourceByPage(ResourceVo resourceVo);

}
