package com.wisdomteam.warehouse.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wisdomteam.warehouse.bean.Foods;
import com.wisdomteam.warehouse.bean.PreFoods;
import com.wisdomteam.warehouse.bean.PutInStorage;
import com.wisdomteam.warehouse.service.FoodsService;
import com.wisdomteam.warehouse.service.PreFoodsService;
import com.wisdomteam.warehouse.service.PutInStorageService;
import com.wisdomteam.warehouse.utils.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PreFoodsController {
	
	@Autowired
	PreFoodsService preFoodsService;
	
	@Autowired
	FoodsService foodsService;
	
	@Autowired
	PutInStorageService putInStorageService;
	
	
	/*@RequestMapping("/prefoods")
	@ResponseBody
	public JsonMsg getPreFoodsWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<PreFoods> prefoods = preFoodsService.getAllPreFoods();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(prefoods, 5);
		return JsonMsg.success().add("pageInfo", page);
	}*/
	

	/*@RequestMapping(value="/prefood/{foodId}",method= RequestMethod.GET)
	@ResponseBody
	public JsonMsg putinstorage(@PathVariable("foodId")Integer foodId) {
		//1.根据foodId查询未入库的食品信息
		PreFoods Prefood = preFoodsService.getPreFoodWithId(foodId);
		//System.out.println(Prefood.getPrefoodName());
		//2.把查询的食品信息插入到tbl_foods表中
		Foods food = new Foods();
		food.setId(null);
		food.setFoodId(Prefood.getPrefoodId());
		//System.out.println(food.getFoodId());
		food.setFoodName(Prefood.getPrefoodName());
		food.setFoodTypeId(Prefood.getPrefoodTypeId());
		food.setFoodPrice(Prefood.getPrefoodPrice());
		food.setFoodNums(Prefood.getPrefoodNums());
		food.setFoodProducer(Prefood.getPrefoodProducer());
		food.setFoodShelflife(Prefood.getPrefoodShelflife());
		food.setFoodShelvesId(Prefood.getPrefoodShelvesId());
		food.setFoodHouseId(Prefood.getPrefoodHouseId());
		foodsService.insertFoodSelective(food);	
		//3.插入食品入库信息到tbl_putinstorage表
		PutInStorage message = new PutInStorage();
		message.setId(null);
		message.setPutinstorageFoodId(foodId);
		message.setPutinstorageFoodNums(Prefood.getPrefoodNums());
		message.setPutinstorageAdminId(1);
		message.setPutinstorageDate(Prefood.getPutinstorageDate());
		putInStorageService.insertPutInStorageMessage(message);
		//4.删除tbl_prefoods表的foodId食品信息
		preFoodsService.deletePrefood(foodId);
		return JsonMsg.success();
	}*/
}
