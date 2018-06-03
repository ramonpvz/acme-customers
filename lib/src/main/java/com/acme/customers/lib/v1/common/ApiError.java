package com.acme.customers.lib.v1.common;

import java.util.UUID;

/**
 * Created by ramon pvazquez on 3/22/2018.
 */
public class ApiError {

    private UUID ref = null;
    private int status;
    private String code;

    public UUID getRef() {
        return ref;
    }

    public void setRef(UUID ref) {
        this.ref = ref;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

