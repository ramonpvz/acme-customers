package com.acme.customers.api.rest.v1.resources;

import com.acme.customers.api.services.CustomerService;
import com.acme.customers.lib.v1.Customer;
import org.apache.catalina.logger.SystemOutLogger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.*;

/**
 * Created by ramon pvazquez on 3/20/2018.
 */
@Path("/customers")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    private CustomerService customerService;

    @DELETE
    @Path("/{id}")
    public Response deleteCustomer(@PathParam("id") String id) throws SQLException {
        System.out.println("deleteCustomer");
        customerService.deleteCustomerById(id);

        return Response.noContent().build();

    }

    @GET
    public Response getCustomers(@QueryParam("limit") Integer limit,
                                 @QueryParam("offset") Integer offset) throws SQLException {

        System.out.println("getCustomers");
        return Response.ok(customerService.findCustomers(limit, offset)).header("X-Total-Count", 0).build();

    }

    @GET
    @Path("/{id}")
    public Response getCustomer(@PathParam("id") String id) throws SQLException {

        System.out.println("getCustomer");
        return Response.ok(customerService.findCustomerById(id)).build();

    }

    @POST
    public Response createCustomer(Customer newCustomer) throws SQLException {

        System.out.println("createCustomer");
        return Response.ok(customerService.createCustomer(newCustomer)).build();

    }

    @PUT
    @Path("/{id}")
    public Response updateCustomer(@PathParam("id") String id, Customer updateCustomer) throws SQLException {

        return  Response.ok(customerService.updateCustomer(id, updateCustomer)).build();

    }

}
