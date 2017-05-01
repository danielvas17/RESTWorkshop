/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author santi
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourcesClasses(resources);
        return resources;
    }

    
    private void addRestResourcesClasses(Set<Class<?>> resources) {
        resources.add(rest.HelloWorldResource.class);
        resources.add(rest.HelloWorldsResource.class);
        resources.add(rest.TestResource.class);
        resources.add(rest.Test2Resource.class);
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(rest.HelloWorldResource.class);
        resources.add(rest.HelloWorldsResource.class);
        resources.add(rest.Test2Resource.class);
    }
    
}
