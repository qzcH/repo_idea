package com.lagou.service;

import com.lagou.domain.Menu;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/18 16:11
 * @description
 */
public interface MenuService {

    /*
        查询所有父子菜单信息
     */
    public List<Menu> findSubMenuListByPid(int pid);

    /*
        查询所有菜单信息
     */
    public List<Menu> findAllMenu();

    /*
        根据ID查询menu
     */
    public Menu findMenuById(Integer id);
}
