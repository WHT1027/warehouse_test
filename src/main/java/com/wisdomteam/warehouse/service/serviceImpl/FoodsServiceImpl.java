package com.wisdomteam.warehouse.service.serviceImpl;

import com.wisdomteam.warehouse.bean.Foods;
import com.wisdomteam.warehouse.mapper.FoodsMapper;
import com.wisdomteam.warehouse.mapper.FoodsMapperCustom;
import com.wisdomteam.warehouse.service.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class FoodsServiceImpl implements FoodsService{

    @Autowired
    FoodsMapper foodsMapper;

    @Autowired
    FoodsMapperCustom foodsMapperCustom;

   @Override
    /**
     * 查询所有食品的信息
     */
    public List<Foods> getAllFoods() {
        return foodsMapperCustom.selectByExampleWithType();
    }

    @Override
    /**
     * 根据食品Id查询食品的信息
     */
    public Foods getFoodWithId(Integer foodId) {
        return foodsMapper.selectByPrimaryKey(foodId);
    }

    /**
     * 食品更新
     * @param food
     */
    @Override
    public void updateFood(Foods food) {
       //foodsMapper.updateByPrimaryKey(food);
       //foodsMapper.updateByPrimaryKeySelective(food);
        foodsMapper.updateByPrimaryKeySelective(food);
    }

    /**
     * 食品删除
     * @param id
     */
    @Override
    public void deleteFood(Integer id) {
        // TODO Auto-generated method stub
        foodsMapper.deleteByPrimaryKey(id);
    }

    /**
     * 食品删除
     * @param id
     */
    @Override
    public void deleteBatch(List<Integer> ids) {

        Example example = new Example(Foods.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andCondition("foodId",ids);
        foodsMapper.deleteByExample(example);
    }

    @Override
    public  void insertFoodSelective(Foods food) {
        foodsMapper.insertSelective(food);
    }
}
