package com.acme.customers.lib.v1.response;

import com.acme.customers.lib.v1.Customer;

import java.util.List;

/**
 * Created by ramon pvazquez on 3/22/2018.
 */
public class CustomerList {

    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
