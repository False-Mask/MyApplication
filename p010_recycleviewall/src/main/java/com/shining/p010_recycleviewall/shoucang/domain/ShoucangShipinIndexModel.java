package com.shining.p010_recycleviewall.shoucang.domain;

import java.io.Serializable;


public class ShoucangShipinIndexModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String imgURL;

    public ShoucangShipinIndexModel() {
    }

    public ShoucangShipinIndexModel(String id, String imgURL) {
        this.id = id;
        this.imgURL = imgURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}