package io.ifrs;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "Ifrs.pw2.message",  defaultValue="" )
    String message;
    
    @ConfigProperty(name = "Ifrs.pw2.name")
    Optional<String> name;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        return name.orElse("IFRS") + " " + message;
    }
}