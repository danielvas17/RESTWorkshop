/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author santi
 */
@Path("/helloworld")
public class HelloWorldsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloWorldsResource
     */
    public HelloWorldsResource() {
    }

    /**
     * Retrieves representation of an instance of rest.HelloWorldsResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        HelloWorldResource resource = HelloWorldResource.getInstance("Hello World!");
        return resource.getJson();
    }

    /**
     * Sub-resource locator method for {name}
     */
    @Path("{name}")
    //@Path("/helloworld")
    public DefaultResouce getHelloWorldResource(@PathParam("name") String name) {
    //public HelloWorldResource getHelloWorldResource() {
        //return HelloWorldResource.getInstance(name);
        switch (name) {
            case "xxx":
                return HelloWorldResource.getInstance(name);
            case "careverga":
                return TestResource.getInstance(name);
            default:
                return null;
        }
    }
}
