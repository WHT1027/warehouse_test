package com.wisdomteam.warehouse.service;

import com.wisdomteam.warehouse.bean.PreFoods;

import java.util.List;

public interface PreFoodsService {

/*	//��ѯ���д���ʳƷ����Ϣ
	public List<PreFoods> getAllPreFoods();*/

	//����ʳƷId��ѯʳƷ����Ϣ
	public PreFoods getPreFoodWithId(Integer foodId);

	//ɾ��ʳƷ��Ϣ
	public void deletePrefood(Integer id);

	
}
