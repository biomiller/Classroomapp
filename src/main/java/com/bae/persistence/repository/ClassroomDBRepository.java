package com.bae.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.bae.persistence.domain.Classroom;
import com.bae.persistence.domain.Trainee;
import com.bae.util.JSONUtil;

@Default
@Transactional(SUPPORTS)
public class ClassroomDBRepository implements ClassroomRepository {

	@PersistenceContext(unitName = "primary")
	EntityManager manager;

	@Inject
	private JSONUtil jsonutil;

	@Override
	public String getClassroom(int classroomID) {

		return jsonutil.getJSONForObject(manager.find(Classroom.class, classroomID));

	}
	
	@Override
	public String getAllClassrooms() {
		Query query = manager.createQuery("SELECT a FROM Classroom a", Classroom.class);
		return jsonutil.getJSONForObject(query.getResultList());
	}

	@Override
	public String createClassroom(String classroom) {

		Classroom newClassroom = jsonutil.getObjectForJSON(classroom, Classroom.class);
		manager.persist(newClassroom);
		return "{\"message\": \"Classroom has been successfully added\"}";

	}

	@Override
	public String deleteClassroom(int classroomID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateClassroom(int classroomID, String classroom) {
		// TODO Auto-generated method stub
		return null;
	}

}
