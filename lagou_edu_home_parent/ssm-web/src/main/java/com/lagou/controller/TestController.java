package com.lagou.controller;

import com.lagou.domain.Test;
import com.lagou.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LH
 * @date 2020/12/28 21:02
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/findAllTest")
    public List<Test> findAll() {

        List<Test> list = testService.findAll();

        return list;

    }

}
