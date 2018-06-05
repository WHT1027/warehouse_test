package com.wisdomteam.warehouse.bean;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tbl_putinstorage")
public class PutInStorage {
    @Id
    private Integer id;

    @Column(name = "putinstorage_food_id")
    private Integer putinstorageFoodId;

    @Column(name = "putinstorage_admin_id")
    private Integer putinstorageAdminId;

    @Column(name = "putinstorage_food_nums")
    private Integer putinstorageFoodNums;

    @Column(name = "putinstorage_date")
    private Date putinstorageDate;

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
     * @return putinstorage_food_id
     */
    public Integer getPutinstorageFoodId() {
        return putinstorageFoodId;
    }

    /**
     * @param putinstorageFoodId
     */
    public void setPutinstorageFoodId(Integer putinstorageFoodId) {
        this.putinstorageFoodId = putinstorageFoodId;
    }

    /**
     * @return putinstorage_admin_id
     */
    public Integer getPutinstorageAdminId() {
        return putinstorageAdminId;
    }

    /**
     * @param putinstorageAdminId
     */
    public void setPutinstorageAdminId(Integer putinstorageAdminId) {
        this.putinstorageAdminId = putinstorageAdminId;
    }

    /**
     * @return putinstorage_food_nums
     */
    public Integer getPutinstorageFoodNums() {
        return putinstorageFoodNums;
    }

    /**
     * @param putinstorageFoodNums
     */
    public void setPutinstorageFoodNums(Integer putinstorageFoodNums) {
        this.putinstorageFoodNums = putinstorageFoodNums;
    }

    /**
     * @return putinstorage_date
     */
    public Date getPutinstorageDate() {
        return putinstorageDate;
    }

    /**
     * @param putinstorageDate
     */
    public void setPutinstorageDate(Date putinstorageDate) {
        this.putinstorageDate = putinstorageDate;
    }
}