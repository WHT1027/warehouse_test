package com.wisdomteam.warehouse.controller;


import com.wisdomteam.warehouse.bean.AdminDepartment;
import com.wisdomteam.warehouse.service.AdminDepartmentService;
import com.wisdomteam.warehouse.service.serviceImpl.AdminDepartmentServiceImpl;
import com.wisdomteam.warehouse.utils.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/AdminDept")
public class AdminDepartmentController {
	
	@Autowired
	AdminDepartmentService adminDepartmentService;

	/**
	 * ��ѯ����Ա������Ϣ
	 * @return
	 */
	@RequestMapping(value="/admindepts",method= RequestMethod.GET)
	@ResponseBody
	public JsonMsg getadmindepts() {
		System.out.println("����AdminDepartmentController��ȡ���ݣ�");
		List<AdminDepartment> adminDepts = adminDepartmentService.getDepts();
		return JsonMsg.success().add("admindepts", adminDepts);
	}
}
