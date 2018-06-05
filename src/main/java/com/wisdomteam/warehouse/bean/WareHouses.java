package com.wisdomteam.warehouse.bean;

import javax.persistence.*;

@Table(name = "tbl_warehouses")
public class WareHouses {
    @Id
    private Integer id;

    @Column(name = "warehouse_id")
    private Integer warehouseId;

    @Column(name = "warehouse_name")
    private String warehouseName;

    @Column(name = "warehouse_type")
    private String warehouseType;

    @Column(name = "warehouse_address")
    private String warehouseAddress;

    @Column(name = "warehouse_status")
    private Integer warehouseStatus;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return warehouse_id
     */
    public Integer getWarehouseId() {
        return warehouseId;
    }

    /**
     * @param warehouseId
     */
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * @return warehouse_name
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**
     * @param warehouseName
     */
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    /**
     * @return warehouse_type
     */
    public String getWarehouseType() {
        return warehouseType;
    }

    /**
     * @param warehouseType
     */
    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    /**
     * @return warehouse_address
     */
    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    /**
     * @param warehouseAddress
     */
    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    /**
     * @return warehouse_status
     */
    public Integer getWarehouseStatus() {
        return warehouseStatus;
    }

    /**
     * @param warehouseStatus
     */
    public void setWarehouseStatus(Integer warehouseStatus) {
        this.warehouseStatus = warehouseStatus;
    }
}