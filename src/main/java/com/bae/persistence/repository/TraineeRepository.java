package com.bae.persistence.repository;

public interface TraineeRepository {
	
	String getAllTrainees();
	String getTrainee(int traineeID);
	String createTrainee(String trainee);
	String deleteTrainee(int traineeID);
	String updateTrainee(int traineeID, String trainee);

}
