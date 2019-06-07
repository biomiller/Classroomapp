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
		Trainee newTrainee = jsonutil.getObjectForJSON(trainee, Trainee.class);
		this.getTraineeMap().put(newTrainee.getTraineeID(), newTrainee);
		return "Added new classroom";
	}


	@Override
	public String deleteTrainee(int traineeID) {
		if (this.getTraineeMap().containsKey(traineeID)) {
			this.getTraineeMap().remove(traineeID);
			return "Trainee with ID " + traineeID + " removed.";
		}

		else {
			return "Trainee does not exist";
		}
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
