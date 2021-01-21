package com.lagou.dao;

import com.lagou.domain.Test;

import java.util.List;

/**
 * @author LH
 * @date 2020/12/28 16:30
 * @description
 */
public interface TestMapper {

    /*
        对test表进行查询所有
     */
    public List<Test> findAll();

}
