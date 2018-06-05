package com.wisdomteam.warehouse.bean;

import javax.persistence.*;

@Table(name = "tbl_getoutstorage")
public class GetOutStorage {
    @Id
    private Integer id;

    @Column(name = "getoutstorage_food_id")
    private Integer getoutstorageFoodId;

    @Column(name = "getoutstorage_admin_id")
    private Integer getoutstorageAdminId;

    @Column(name = "getoutstorage_food_nums")
    private Integer getoutstorageFoodNums;

    @Column(name = "getoutstorage__food_totalprice")
    private Double getoutstorageFoodTotalprice;

    @Column(name = "getoutstorage_type")
    private String getoutstorageType;

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
     * @return getoutstorage_food_id
     */
    public Integer getGetoutstorageFoodId() {
        return getoutstorageFoodId;
    }

    /**
     * @param getoutstorageFoodId
     */
    public void setGetoutstorageFoodId(Integer getoutstorageFoodId) {
        this.getoutstorageFoodId = getoutstorageFoodId;
    }

    /**
     * @return getoutstorage_admin_id
     */
    public Integer getGetoutstorageAdminId() {
        return getoutstorageAdminId;
    }

    /**
     * @param getoutstorageAdminId
     */
    public void setGetoutstorageAdminId(Integer getoutstorageAdminId) {
        this.getoutstorageAdminId = getoutstorageAdminId;
    }

    /**
     * @return getoutstorage_food_nums
     */
    public Integer getGetoutstorageFoodNums() {
        return getoutstorageFoodNums;
    }

    /**
     * @param getoutstorageFoodNums
     */
    public void setGetoutstorageFoodNums(Integer getoutstorageFoodNums) {
        this.getoutstorageFoodNums = getoutstorageFoodNums;
    }

    /**
     * @return getoutstorage__food_totalprice
     */
    public Double getGetoutstorageFoodTotalprice() {
        return getoutstorageFoodTotalprice;
    }

    /**
     * @param getoutstorageFoodTotalprice
     */
    public void setGetoutstorageFoodTotalprice(Double getoutstorageFoodTotalprice) {
        this.getoutstorageFoodTotalprice = getoutstorageFoodTotalprice;
    }

    /**
     * @return getoutstorage_type
     */
    public String getGetoutstorageType() {
        return getoutstorageType;
    }

    /**
     * @param getoutstorageType
     */
    public void setGetoutstorageType(String getoutstorageType) {
        this.getoutstorageType = getoutstorageType;
    }
}