package com.wisdomteam.warehouse.bean;

import javax.persistence.*;

@Table(name = "tbl_prefoods")
public class PreFoods {
    @Id
    @Column(name = "food_id")
    private Integer foodId;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "food_type_id")
    private Integer foodTypeId;

    @Column(name = "food_price")
    private Double foodPrice;

    @Column(name = "food_nums")
    private Integer foodNums;

    @Column(name = "food_shelflife")
    private Integer foodShelflife;

    @Column(name = "food_producer")
    private String foodProducer;

    @Column(name = "food_shelves_id")
    private Integer foodShelvesId;

    @Column(name = "food_house_id")
    private Integer foodHouseId;

    @Column(name = "food_storagetime")
    private Integer foodStoragetime;

    /**
     * @return food_id
     */
    public Integer getFoodId() {
        return foodId;
    }

    /**
     * @param foodId
     */
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    /**
     * @return food_name
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param foodName
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @return food_type_id
     */
    public Integer getFoodTypeId() {
        return foodTypeId;
    }

    /**
     * @param foodTypeId
     */
    public void setFoodTypeId(Integer foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    /**
     * @return food_price
     */
    public Double getFoodPrice() {
        return foodPrice;
    }

    /**
     * @param foodPrice
     */
    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    /**
     * @return food_nums
     */
    public Integer getFoodNums() {
        return foodNums;
    }

    /**
     * @param foodNums
     */
    public void setFoodNums(Integer foodNums) {
        this.foodNums = foodNums;
    }

    /**
     * @return food_shelflife
     */
    public Integer getFoodShelflife() {
        return foodShelflife;
    }

    /**
     * @param foodShelflife
     */
    public void setFoodShelflife(Integer foodShelflife) {
        this.foodShelflife = foodShelflife;
    }

    /**
     * @return food_producer
     */
    public String getFoodProducer() {
        return foodProducer;
    }

    /**
     * @param foodProducer
     */
    public void setFoodProducer(String foodProducer) {
        this.foodProducer = foodProducer;
    }

    /**
     * @return food_shelves_id
     */
    public Integer getFoodShelvesId() {
        return foodShelvesId;
    }

    /**
     * @param foodShelvesId
     */
    public void setFoodShelvesId(Integer foodShelvesId) {
        this.foodShelvesId = foodShelvesId;
    }

    /**
     * @return food_house_id
     */
    public Integer getFoodHouseId() {
        return foodHouseId;
    }

    /**
     * @param foodHouseId
     */
    public void setFoodHouseId(Integer foodHouseId) {
        this.foodHouseId = foodHouseId;
    }

    /**
     * @return food_storagetime
     */
    public Integer getFoodStoragetime() {
        return foodStoragetime;
    }

    /**
     * @param foodStoragetime
     */
    public void setFoodStoragetime(Integer foodStoragetime) {
        this.foodStoragetime = foodStoragetime;
    }
}