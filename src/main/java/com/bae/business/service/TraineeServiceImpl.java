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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateTrainee(int traineeID, String trainee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAllTrainees() {
		return repo.getAllTrainees();

	}

}
