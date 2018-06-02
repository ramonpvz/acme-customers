package com.acme.customers.api.rest.v1.services.exceptions;

/**
 * Created by nomar on 3/26/18.
 */
public class EmptyPayloadException extends RuntimeException {

    private String resource;

    public EmptyPayloadException(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

}
