package com.wisdomteam.warehouse.service;

import com.wisdomteam.warehouse.bean.Foods;
import java.util.List;


public interface FoodsService {

	/**
	 * ��ѯ����ʳƷ����Ϣ
	 * @return
	 */
	public List<Foods> getAllFoods();

	/**
	 * ����ʳƷId��ѯʳƷ����Ϣ
	 * @param foodId
	 * @return
	 */
	public Foods getFoodWithId(Integer foodId);
	
	/**
	 * ����ʳƷ��Ϣ
	 * @param food
	 */
	public void updateFood(Foods food);
	
	/**
	 * ����ɾ��ʳƷ��Ϣ
	 * @param id
	 */
	public void deleteFood(Integer id);

	/**
	 *  ����ɾ��ʳƷ��Ϣ
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids);

	/**
	 * ����ʳƷ��Ϣ
	 * @param food
	 */
	public  void insertFoodSelective(Foods food);

}
