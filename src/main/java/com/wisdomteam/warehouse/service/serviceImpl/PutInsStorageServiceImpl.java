package com.wisdomteam.warehouse.service.serviceImpl;

import com.wisdomteam.warehouse.bean.PutInStorage;
import com.wisdomteam.warehouse.mapper.PutInStorageMapper;
import com.wisdomteam.warehouse.service.PutInStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PutInsStorageServiceImpl implements PutInStorageService{

    @Autowired
    PutInStorageMapper putInStorageMapper;

    @Override
    /**
     * 插入入库信息
     * @param message
     */
    public void insertPutInStorageMessage(PutInStorage message) {
        putInStorageMapper.insertSelective(message);
    }
}
