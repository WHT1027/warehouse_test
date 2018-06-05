package com.wisdomteam.warehouse.bean;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tbl_foods_temperature")
public class FoodTemperature {
    @Id
    private Integer id;

    @Column(name = "food_id")
    private Integer foodId;

    @Column(name = "food_temperature")
    private Double foodTemperature;

    @Column(name = "temperature_time")
    private Date temperatureTime;

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
     * @return food_temperature
     */
    public Double getFoodTemperature() {
        return foodTemperature;
    }

    /**
     * @param foodTemperature
     */
    public void setFoodTemperature(Double foodTemperature) {
        this.foodTemperature = foodTemperature;
    }

    /**
     * @return temperature_time
     */
    public Date getTemperatureTime() {
        return temperatureTime;
    }

    /**
     * @param temperatureTime
     */
    public void setTemperatureTime(Date temperatureTime) {
        this.temperatureTime = temperatureTime;
    }
}