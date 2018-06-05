package com.wisdomteam.warehouse.service.serviceImpl;

import com.wisdomteam.warehouse.bean.FoodsType;
import com.wisdomteam.warehouse.mapper.FoodsTypeMapper;
import com.wisdomteam.warehouse.service.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodTypeServiceImpl implements FoodTypeService{

    @Autowired
    FoodsTypeMapper foodsTypeMapper;

    @Override
    public List<FoodsType> getFoodTypes() {
        return foodsTypeMapper.selectByExample(null);
    }
}
