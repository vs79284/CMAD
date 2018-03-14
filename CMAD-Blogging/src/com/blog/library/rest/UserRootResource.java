package com.blog.library.rest;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.blog.library.Exceptions.InvalidUserException;
import com.blog.library.api.UserApi;
import com.blog.library.business.BloggerUser;
import com.blog.library.model.User;


@Path("/blogging")
public class UserRootResource {
	UserApi api = new BloggerUser();
	
	@POST
	@Path("/user")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUses(User user) {
		System.out.println("Inside the rest call");
		try {
			api.add(user);
			return Response.created(new URI(user.getId() + "")).build();
		} catch (Exception e) {
			throw new InvalidUserException("");
		}

	}
	
	@GET
	@Path("/user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") String id) {
		System.out.println("Inside the rest call");
		try {
			User user=api.get(id);
			return Response.ok().entity(user).build();
		} catch (Exception e) {
			throw new InvalidUserException("");
		}

	}
	
	@GET
	@Path("/status")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStatus() {
		System.out.println("Inside the rest call");
		try {
			return Response.ok().build();
		} catch (Exception e) {
			throw new InvalidUserException("");
		}

	}

}
