package com.wisdomteam.warehouse.service.serviceImpl;

import com.wisdomteam.warehouse.bean.FoodTemperature;
import com.wisdomteam.warehouse.mapper.FoodTemperatureMapper;
import com.wisdomteam.warehouse.service.FoodTemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodTemperatureServiceImpl implements FoodTemperatureService{

    @Autowired
    FoodTemperatureMapper foodTemperatureMapper;

    @Override
    public List<FoodTemperature> queryPushPlan() {
        System.out.println("运行service层");
        return foodTemperatureMapper.selectByExample(null);
    }
}
