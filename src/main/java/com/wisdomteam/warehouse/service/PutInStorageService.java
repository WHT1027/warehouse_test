package com.wisdomteam.warehouse.service;

import com.wisdomteam.warehouse.bean.PutInStorage;

public interface PutInStorageService {

	
	/**
	 * 插入入库信息
	 * @param message
	 */
	public void insertPutInStorageMessage(PutInStorage message);
}
