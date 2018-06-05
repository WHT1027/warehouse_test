package com.wisdomteam.warehouse.bean;

import javax.persistence.*;

@Table(name = "tbl_houses")
public class Houses {
    @Id
    private Integer id;

    @Column(name = "house_id")
    private Integer houseId;

    @Column(name = "house_shelves_nums")
    private Integer houseShelvesNums;

    @Column(name = "house_warehouse_id")
    private Integer houseWarehouseId;

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
     * @return house_id
     */
    public Integer getHouseId() {
        return houseId;
    }

    /**
     * @param houseId
     */
    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    /**
     * @return house_shelves_nums
     */
    public Integer getHouseShelvesNums() {
        return houseShelvesNums;
    }

    /**
     * @param houseShelvesNums
     */
    public void setHouseShelvesNums(Integer houseShelvesNums) {
        this.houseShelvesNums = houseShelvesNums;
    }

    /**
     * @return house_warehouse_id
     */
    public Integer getHouseWarehouseId() {
        return houseWarehouseId;
    }

    /**
     * @param houseWarehouseId
     */
    public void setHouseWarehouseId(Integer houseWarehouseId) {
        this.houseWarehouseId = houseWarehouseId;
    }
}