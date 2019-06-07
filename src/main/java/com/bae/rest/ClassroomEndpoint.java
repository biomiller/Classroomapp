package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.bae.business.service.ClassroomService;

@Path("/Classroom")
public class ClassroomEndpoint {
	
	@Inject
	ClassroomService service;
	
	@Path("/getClassroom/{id}")
	@GET
	@Produces({ "application/json" })
	public String getClassroom(@PathParam("id") int id) {
		return service.getClassroom(id);
	}
	
	@Path("/createClassroom")
	@POST
	@Produces({ "application/json" })
	public String createClassroom(String trainee) {
		return service.createClassroom(trainee);
	}

}
