package com.acme.customers.api.mappers;

import com.acme.customers.api.models.db.CustomerEntity;
import com.acme.customers.lib.v1.Customer;

/**
 * Created by nomar on 8/1/18.
 */
public class CustomerMapper {

    public static Customer toCustomer(CustomerEntity entity) {

        if (entity == null) return null;

        Customer customer = new Customer();

        customer.setId(entity.getId());
        customer.setFirstName(entity.getFirstName());
        customer.setLastName(entity.getLastName());
        customer.setCreatedAt(entity.getCreatedAt());
        customer.setUpdatedAt(entity.getUpdatedAt());
        customer.setStatus(entity.getStatus());
        customer.setDateOfBirth(entity.getDateOfBirth());

        return customer;

    }

    public static CustomerEntity toCustomerEntity(Customer customer) {

        if (customer == null) return null;

        CustomerEntity entity = new CustomerEntity();
        entity.setFirstName(customer.getFirstName());
        entity.setLastName(customer.getLastName());
        entity.setStatus(customer.getStatus());
        entity.setDateOfBirth(entity.getDateOfBirth());

        return entity;

    }

}