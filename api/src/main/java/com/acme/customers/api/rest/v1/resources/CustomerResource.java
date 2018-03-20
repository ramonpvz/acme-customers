package com.acme.customers.api.rest.v1.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by ramon pvazquez on 3/20/2018.
 */
@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @GET
    public Response hello() {
        return Response.ok("Hello").build();
    }

}
