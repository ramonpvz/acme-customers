package com.acme.customers.lib.v1;

/**
 * Created by ramon pvazquez on 3/22/2018.
 */
public enum CustomerStatus {

    ACTIVE(1), INACTIVE(2);

    private int value;

    private CustomerStatus(int value) {
        this.value = value;
    }

}
