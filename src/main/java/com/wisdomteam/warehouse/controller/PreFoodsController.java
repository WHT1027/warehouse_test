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
		// �ⲻ��һ����ҳ��ѯ
		// ����PageHelper��ҳ���
		// �ڲ�ѯ֮ǰֻ��Ҫ���ã�����ҳ�룬�Լ�ÿҳ�Ĵ�С
		PageHelper.startPage(pn, 5);
		// startPage��������������ѯ����һ����ҳ��ѯ
		List<PreFoods> prefoods = preFoodsService.getAllPreFoods();
		// ʹ��pageInfo��װ��ѯ��Ľ����ֻ��Ҫ��pageInfo����ҳ������ˡ�
		// ��װ����ϸ�ķ�ҳ��Ϣ,���������ǲ�ѯ���������ݣ�����������ʾ��ҳ��
		PageInfo page = new PageInfo(prefoods, 5);
		return JsonMsg.success().add("pageInfo", page);
	}*/
	

	/*@RequestMapping(value="/prefood/{foodId}",method= RequestMethod.GET)
	@ResponseBody
	public JsonMsg putinstorage(@PathVariable("foodId")Integer foodId) {
		//1.����foodId��ѯδ����ʳƷ��Ϣ
		PreFoods Prefood = preFoodsService.getPreFoodWithId(foodId);
		//System.out.println(Prefood.getPrefoodName());
		//2.�Ѳ�ѯ��ʳƷ��Ϣ���뵽tbl_foods����
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
		//3.����ʳƷ�����Ϣ��tbl_putinstorage��
		PutInStorage message = new PutInStorage();
		message.setId(null);
		message.setPutinstorageFoodId(foodId);
		message.setPutinstorageFoodNums(Prefood.getPrefoodNums());
		message.setPutinstorageAdminId(1);
		message.setPutinstorageDate(Prefood.getPutinstorageDate());
		putInStorageService.insertPutInStorageMessage(message);
		//4.ɾ��tbl_prefoods���foodIdʳƷ��Ϣ
		preFoodsService.deletePrefood(foodId);
		return JsonMsg.success();
	}*/
}
