package com.wisdomteam.warehouse.bean;

import javax.persistence.*;

@Table(name = "tbl_admin")
public class Admin {
    @Id
    @Column(name = "admin_id")
    private Integer adminId;

    @Column(name = "admin_username")
    private String adminUsername;

    @Column(name = "admin_password")
    private String adminPassword;

    @Column(name = "admin_gender")
    private String adminGender;

    @Column(name = "admin_phone")
    private String adminPhone;

    @Column(name = "admin_email")
    private String adminEmail;

    @Column(name = "admin_dept_id")
    private Integer adminDeptId;

    /**
     * @return admin_id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * @param adminId
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * @return admin_username
     */
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * @param adminUsername
     */
    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * @return admin_password
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * @param adminPassword
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * @return admin_gender
     */
    public String getAdminGender() {
        return adminGender;
    }

    /**
     * @param adminGender
     */
    public void setAdminGender(String adminGender) {
        this.adminGender = adminGender;
    }

    /**
     * @return admin_phone
     */
    public String getAdminPhone() {
        return adminPhone;
    }

    /**
     * @param adminPhone
     */
    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    /**
     * @return admin_email
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * @param adminEmail
     */
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    /**
     * @return admin_dept_id
     */
    public Integer getAdminDeptId() {
        return adminDeptId;
    }

    /**
     * @param adminDeptId
     */
    public void setAdminDeptId(Integer adminDeptId) {
        this.adminDeptId = adminDeptId;
    }
}