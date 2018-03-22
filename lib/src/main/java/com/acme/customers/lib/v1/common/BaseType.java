package com.acme.customers.lib.v1.common;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by ramon pvazquez on 3/22/2018.
 */
public class BaseType {

    private String id;
    private Date updatedAt;
    private Date createdAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}