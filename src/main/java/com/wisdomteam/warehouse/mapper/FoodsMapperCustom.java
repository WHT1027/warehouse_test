package com.wisdomteam.warehouse.mapper;

import com.wisdomteam.warehouse.bean.Foods;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface FoodsMapperCustom {

    List<Foods> selectByExampleWithType();
}
