package com.wisdomteam.warehouse.service.serviceImpl;

import com.wisdomteam.warehouse.bean.PreFoods;
import com.wisdomteam.warehouse.mapper.PreFoodsMapper;
import com.wisdomteam.warehouse.service.PreFoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreFoodsServiceImpl implements PreFoodsService{

    @Autowired
    PreFoodsMapper preFoodsMapper;

  /*  @Override
    //查询所有待入食品的信息
    public List<PreFoods> getAllPreFoods() {
        return preFoodsMapper.selectByExampleWithType(null);
    }*/

    @Override
    //根据食品Id查询食品的信息
    public PreFoods getPreFoodWithId(Integer foodId) {
        return preFoodsMapper.selectByPrimaryKey(foodId);
    }

    @Override
    public void deletePrefood(Integer id) {
        // TODO Auto-generated method stub
        preFoodsMapper.deleteByPrimaryKey(id);
    }
}
