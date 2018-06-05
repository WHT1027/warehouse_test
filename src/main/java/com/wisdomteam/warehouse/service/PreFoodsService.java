package com.wisdomteam.warehouse.service;

import com.wisdomteam.warehouse.bean.PreFoods;

import java.util.List;

public interface PreFoodsService {

/*	//查询所有待入食品的信息
	public List<PreFoods> getAllPreFoods();*/

	//根据食品Id查询食品的信息
	public PreFoods getPreFoodWithId(Integer foodId);

	//删除食品信息
	public void deletePrefood(Integer id);

	
}
