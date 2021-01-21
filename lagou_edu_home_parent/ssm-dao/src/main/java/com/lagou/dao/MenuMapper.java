package com.lagou.dao;

import com.lagou.domain.Menu;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/18 11:50
 * @description
 */
public interface MenuMapper {

    /*
        查询所有父子菜单信息
     */
    public List<Menu> findSubMenuListByPid(int pid);

    /*
        查询所有菜单列表
     */
    public List<Menu> findAllMenu();

    /*
        根据ID查询menu
     */
    public Menu findMenuById(Integer id);
}
