/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author santi
 */
@Path("caremonda")
public class Test2Resource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CaremondaResource
     */
    public Test2Resource() {
    }

    /**
     * Retrieves representation of an instance of rest.CaremondaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{name}")
    public String getJson(@Context UriInfo uriInfo, @PathParam("name") String name) {
        //TODO return proper representation object
        System.out.println("params: " + name);
        return "soy caremonda";
    }

    /**
     * PUT method for updating or creating an instance of CaremondaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
