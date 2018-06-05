package com.wisdomteam.warehouse.service;

import com.wisdomteam.warehouse.bean.Admin;
public interface AdminService  {

    //查询管理员信息
    public Admin getAdminById(int Id);

    //更新管理员信息
    public void updateAdmin(Admin admin);
}
