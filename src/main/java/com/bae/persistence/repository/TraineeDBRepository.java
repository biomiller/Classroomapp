package com.bae.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.bae.persistence.domain.Trainee;
import com.bae.util.JSONUtil;

@Default
@Transactional(SUPPORTS)
public class TraineeDBRepository implements TraineeRepository {

	@PersistenceContext(unitName = "primary")
	EntityManager manager;

	@Inject
	private JSONUtil jsonutil;

	@Override
	public String getTrainee(int traineeID) {

		return jsonutil.getJSONForObject(manager.find(Trainee.class, traineeID));
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

}
