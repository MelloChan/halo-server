package com.halo.entity;

import java.util.Date;

/**
 * @author MelloChan
 */
public class ProductImage {
    private Long id;
    private String imgUrl;
    private Long proId;
    private Date gmtCreate;
    private Date gmtUpdated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgurl) {
        this.imgUrl = imgUrl;
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = this.proId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdated() {
        return gmtUpdated;
    }

    public void setGmtUpdated(Date gmtUpdated) {
        this.gmtUpdated = gmtUpdated;
    }
}