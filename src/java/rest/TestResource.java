/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author santi
 */
//public class CarevergaResource {
public class TestResource extends DefaultResouce {

    private String name;

    /**
     * Creates a new instance of HelloWorldResource
     */
    private TestResource(String name) {
        this.name = name;
    }

    /**
     * Get instance of the HelloWorldResource
     */
    public static TestResource getInstance(String name) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of HelloWorldResource class.
        return new TestResource(name);
    }

    /**
     * Retrieves representation of an instance of rest.HelloWorldResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        System.out.println("pase por aqui 3");
        return "careverga 3";
    }

    /**
     * PUT method for updating or creating an instance of HelloWorldResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource HelloWorldResource
     */
    @DELETE
    public void delete() {
    }
}
