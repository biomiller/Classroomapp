package com.bae.business.service;

import javax.inject.Inject;

import com.bae.persistence.repository.ClassroomRepository;


public class ClassroomServiceImpl implements ClassroomService {
	
	@Inject
	ClassroomRepository repo;

	@Override
	public String getClassroom(int classroomID) {
		return repo.getClassroom(classroomID);
	}

	@Override
	public String createClassroom(String classroom) {
		return repo.createClassroom(classroom);
	}

	@Override
	public String deleteClassroom(int classroomID) {
		return repo.deleteClassroom(classroomID);
	}

	@Override
	public String updateClassroom(int classroomID, String classroom) {
		return repo.updateClassroom(classroomID, classroom);
	}

	@Override
	public String getAllClassrooms() {
		return repo.getAllClassrooms();

	}

}
