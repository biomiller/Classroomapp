package com.bae.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.bae.persistence.domain.Classroom;
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
	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT a FROM Trainee a", Trainee.class);
		return jsonutil.getJSONForObject(query.getResultList());
	}

	@Override
	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {

		Trainee newTrainee = jsonutil.getObjectForJSON(trainee, Trainee.class);
		manager.persist(newTrainee);
		return "{\"message\": \"trainee has been successfully added\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteTrainee(int traineeID) {
		try {
			Trainee trainee = manager.find(Trainee.class, traineeID);
			manager.remove(trainee);
			return "{\"message\": \"Trainee has been successfully deleted\"}";
		} catch (NoResultException e) {
			return "{\"message\": \"No trainee found with that id.\"}";
		}
	}

	@Override
	public String updateTrainee(int traineeID, String trainee) {
		// TODO Auto-generated method stub
		return null;
	}



}
