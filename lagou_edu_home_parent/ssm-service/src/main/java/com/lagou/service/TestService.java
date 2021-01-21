package com.lagou.service;

import com.lagou.domain.Test;

import java.util.List;

/**
 * @author LH
 * @date 2020/12/28 20:39
 * @description
 */
public interface TestService {

    /*
        对test表进行查询所有
     */
    public List<Test> findAll();

}
