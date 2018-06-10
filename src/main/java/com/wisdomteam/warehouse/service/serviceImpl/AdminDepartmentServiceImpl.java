package com.wisdomteam.warehouse.service.serviceImpl;

import com.wisdomteam.warehouse.bean.AdminDepartment;
import com.wisdomteam.warehouse.mapper.AdminDepartmentMapper;
import com.wisdomteam.warehouse.service.AdminDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminDepartmentServiceImpl implements AdminDepartmentService{

     @Autowired
     AdminDepartmentMapper adminDepartmentMapper;

    @Override
    public List<AdminDepartment> getDepts() {
        List<AdminDepartment> list = adminDepartmentMapper.selectAll();
        return list;
    }
}
