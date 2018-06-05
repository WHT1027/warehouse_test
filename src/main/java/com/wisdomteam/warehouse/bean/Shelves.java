package com.wisdomteam.warehouse.bean;

import javax.persistence.*;

@Table(name = "tbl_shelves")
public class Shelves {
    @Id
    private Integer id;

    @Column(name = "shelves_id")
    private Integer shelvesId;

    @Column(name = "shelves_type")
    private String shelvesType;

    @Column(name = "shelves_size")
    private Integer shelvesSize;

    @Column(name = "shelves_house_id")
    private Integer shelvesHouseId;

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
     * @return shelves_id
     */
    public Integer getShelvesId() {
        return shelvesId;
    }

    /**
     * @param shelvesId
     */
    public void setShelvesId(Integer shelvesId) {
        this.shelvesId = shelvesId;
    }

    /**
     * @return shelves_type
     */
    public String getShelvesType() {
        return shelvesType;
    }

    /**
     * @param shelvesType
     */
    public void setShelvesType(String shelvesType) {
        this.shelvesType = shelvesType;
    }

    /**
     * @return shelves_size
     */
    public Integer getShelvesSize() {
        return shelvesSize;
    }

    /**
     * @param shelvesSize
     */
    public void setShelvesSize(Integer shelvesSize) {
        this.shelvesSize = shelvesSize;
    }

    /**
     * @return shelves_house_id
     */
    public Integer getShelvesHouseId() {
        return shelvesHouseId;
    }

    /**
     * @param shelvesHouseId
     */
    public void setShelvesHouseId(Integer shelvesHouseId) {
        this.shelvesHouseId = shelvesHouseId;
    }
}