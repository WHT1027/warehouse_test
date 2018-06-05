package com.wisdomteam.warehouse.service.serviceImpl;

import com.wisdomteam.warehouse.bean.Admin;
import com.wisdomteam.warehouse.mapper.AdminMapper;
import com.wisdomteam.warehouse.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin getAdminById(int Id) {
        return adminMapper.selectByPrimaryKey(Id);
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminMapper.updateByPrimaryKeySelective(admin);
    }
}
