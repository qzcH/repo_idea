package com.lagou.dao;

import com.lagou.domain.Role;
import com.lagou.domain.Role_menu_relation;

import java.util.List;

/**
 * @author LH
 * @date 2021/1/18 10:52
 * @description
 */
public interface RoleMapper {

    /*
        查询所有角色&条件进行查询
     */
    public List<Role> findAllRole(Role role);

    /*
        根据角色ID查询该角色关联的菜单信息ID
     */
    public List<Integer> findMenuByRoleId(Integer roleId);

    /*
        根据roleId清空中间表的关联关系
     */
    public void deleteRoleContextMenu(Integer rid);

    /*
        为角色分配菜单信息
     */
    public void roleContextMenu(Role_menu_relation role_menu_relation);

    /*
        删除角色
     */
    public void deleteRole(Integer roleId);

}
