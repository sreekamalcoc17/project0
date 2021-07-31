package com.revature.project01;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("controller")
public class Controller {

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello() {
		return "Hello";
	}
	
	@POST
	@Path("/show")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public boolean PostForm(@FormParam("username") String fname ,@FormParam("password") String lname) {
       System.out.println("Accept was " + fname + " " + lname) ;
		return true;
    }
}