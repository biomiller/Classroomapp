package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.bae.business.service.TraineeService;

@Path("/Trainee")
public class TraineeEndpoint {
	
	@Inject
	TraineeService service;
	
	@Path("/getTrainee/{id}")
	@GET
	@Produces({ "application/json" })
	public String getTrainee(@PathParam("id") int id) {
		return service.getTrainee(id);
	}

}
