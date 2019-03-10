package com.nit.resources;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * 
 * @author Ashok
 *
 */
@Path("/greet")
@Singleton
public class GreetResource {

	public GreetResource() {
		System.out.println("GreetResource::Constructor");
	}

	/**
	 * This method is used handle GET request
	 * 
	 * @return
	 */
	@GET
	public Response greet() {
		String msg = "Welcome to JAX-RS 2.o API";
		return Response.ok(msg).build();
	}

}
