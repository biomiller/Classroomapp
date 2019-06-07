package com.bae.business.service;

public interface TraineeService {
	
	String getTrainee(int traineeID);
	String createTrainee(String trainee);
	String deleteTrainee(int traineeID);
	String updateTrainee(int traineeID, String trainee);

}
