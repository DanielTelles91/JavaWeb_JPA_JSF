package com.mycompany.javaweb_jpa_jsf.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Daniel A. Telles
 */
@Path("jakartaee10")
public class JakartaEE10Resource {
    
    @GET
    public Response ping(){
        return Response
                .ok("ping Jakarta EE")
                .build();
    }
}
