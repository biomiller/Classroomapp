package com.bae.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import com.bae.persistence.domain.Classroom;
import com.bae.persistence.domain.Trainee;
import com.bae.util.JSONUtil;


@Alternative
public class TraineeMapRepository implements TraineeRepository {

	private Map<Integer, Trainee> traineeMap = new HashMap<Integer, Trainee>();

	JSONUtil jsonutil = new JSONUtil();

	@Override
	public String getTrainee(int traineeID) {
		return jsonutil.getJSONForObject(this.getTraineeMap().get(traineeID));
	}

	@Override
	public String createTrainee(String trainee) {
		// TODO Auto-generated method stub
		return null;
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

	public Map<Integer, Trainee> getTraineeMap() {
		return traineeMap;
	}

	@Override
	public String getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

}
