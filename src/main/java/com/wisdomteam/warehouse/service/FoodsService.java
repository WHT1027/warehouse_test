package com.wisdomteam.warehouse.service;

import com.wisdomteam.warehouse.bean.Foods;
import java.util.List;


public interface FoodsService {

	/**
	 * 查询所有食品的信息
	 * @return
	 */
	public List<Foods> getAllFoods();

	/**
	 * 根据食品Id查询食品的信息
	 * @param foodId
	 * @return
	 */
	public Foods getFoodWithId(Integer foodId);
	
	/**
	 * 更新食品信息
	 * @param food
	 */
	public void updateFood(Foods food);
	
	/**
	 * 单条删除食品信息
	 * @param id
	 */
	public void deleteFood(Integer id);

	/**
	 *  批量删除食品信息
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids);

	/**
	 * 增加食品信息
	 * @param food
	 */
	public  void insertFoodSelective(Foods food);

}
