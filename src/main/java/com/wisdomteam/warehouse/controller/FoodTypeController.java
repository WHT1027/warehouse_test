package com.wisdomteam.warehouse.controller;


import com.wisdomteam.warehouse.bean.FoodsType;
import com.wisdomteam.warehouse.service.FoodTypeService;
import com.wisdomteam.warehouse.utils.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/foodtypes")
public class FoodTypeController {
	
	@Autowired
	FoodTypeService foodTypeService;
	
	@RequestMapping(value="/getfoodtypes",method= RequestMethod.GET)
	@ResponseBody
	public JsonMsg getFoodTypes() {
		System.out.println("getFoodTypes start!");
		List<FoodsType> foodsType = foodTypeService.getFoodTypes();
		return JsonMsg.success().add("foodsType", foodsType);
	}
}
