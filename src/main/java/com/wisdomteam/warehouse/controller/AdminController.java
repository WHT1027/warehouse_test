package com.wisdomteam.warehouse.controller;

import com.wisdomteam.warehouse.bean.Admin;
import com.wisdomteam.warehouse.service.AdminService;
import com.wisdomteam.warehouse.utils.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    /**
     * 登陆验证
     * @return
     * @throws IOException
     */
    @RequestMapping(value="/logincheck")
    @ResponseBody
    public JsonMsg loginCheck(@RequestParam("userId")String userId, @RequestParam("userPassword")String userPassword) throws IOException {
        System.out.println("进入后台处理中");
        System.out.println(userId);
        System.out.println(userPassword);

        //1.从后台数据库查询管理员信息
        Admin admin = getAdmin();
	    System.out.println(admin.getAdminId().toString());
		System.out.println(admin.getAdminPassword());
        //2.验证登陆信息是否正确
        if(!userId.equals(admin.getAdminId().toString())) {
            return JsonMsg.fail().add("va_msg", "账号错误！");
        }
        if(!userPassword.equals(admin.getAdminPassword())) {
            return JsonMsg.fail().add("va_msg", "密码错误！");
        }
        return  JsonMsg.success().add("va_msg", "登陆成功！");
    }

    /**
     * 查询管理员信息
     * @return
     */
    public Admin getAdmin() {
        return adminService.getAdminById(20152413);
    }

    /**
     * 通过userid查询管理员信息
     * @param id
     * @return
     */
    @RequestMapping(value="/admin/{id}",method=RequestMethod.GET)
    @ResponseBody
    public JsonMsg getAdminById(@PathVariable("id")Integer id) {
        System.out.println(id);
        Admin admin = adminService.getAdminById(id);
        return JsonMsg.success().add("admin", admin);
    }
    @RequestMapping(value="/updateadmin",method= RequestMethod.POST)
    @ResponseBody
    public JsonMsg updateAdmin(@Valid Admin admin) {
        adminService.updateAdmin(admin);
        return JsonMsg.success();
    }
}
