package com.bae.business.service;

import javax.inject.Inject;

import com.bae.persistence.repository.TraineeRepository;

public class TraineeServiceImpl implements TraineeService {
	
	@Inject
	TraineeRepository repo;

	@Override
	public String getTrainee(int traineeID) {
		return repo.getTrainee(traineeID);
	}

	@Override
	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}

	@Override
	public String deleteTrainee(int traineeID) {
		return repo.deleteTrainee(traineeID);

	}

	@Override
	public String updateTrainee(int traineeID, String trainee) {
		return repo.updateTrainee(traineeID, trainee);

	}

	@Override
	public String getAllTrainees() {
		return repo.getAllTrainees();

	}

}
