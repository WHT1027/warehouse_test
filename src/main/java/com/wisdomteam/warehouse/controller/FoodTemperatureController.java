package com.wisdomteam.warehouse.controller;


import com.wisdomteam.warehouse.service.FoodTemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class FoodTemperatureController {
	
		@Autowired
		FoodTemperatureService foodTemperatureService;
		/*//项目推进计划push_plan
		@RequestMapping(value="/topushPlanShow",method= RequestMethod.POST)
		public String topushPlanShow(Model model){

		//取得数据库的数据，使用list<map>方式存储值
			//List<FoodTemperature> list1 = foodTemperatureService.queryPushPlan();
		    List<Map<String,Object>> list = (List<Map<String,Object>>)foodTemperatureService.queryPushPlan();
		//用来存放遍历后map的键值

		ArrayList<String> wancheng = new ArrayList<String>();
		    for (Map<String,Object> maps :list){
		        String wan = maps.get("foodTemperature").toString();
		        String wei = maps.get("temperatureTime").toString();
		        wancheng.add(wan);
		        wancheng.add(wei);
		    }

		//存在.addAttribute用于jsp页面的取值
		    model.addAttribute("showwan",wancheng);
		    System.err.println("_________wancheng_____________-"+wancheng);
		    return "chart";
		}*/
		
}
