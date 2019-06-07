package com.bae.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.bae.persistence.domain.Classroom;
import com.bae.util.JSONUtil;


public class ClassroomMapRepository implements ClassroomRepository {
	
	
	private Map<Integer, Classroom> classroomMap = new HashMap<Integer, Classroom>();
	

	JSONUtil jsonutil = new JSONUtil();
	




	@Override
	public String getClassroom(int classroomID) {
		return jsonutil.getJSONForObject(this.getClassroomMap().get(classroomID));
	}

	@Override
	public String createClassroom(String classroom) {
		Classroom newClassroom = jsonutil.getObjectForJSON(classroom, Classroom.class);
		this.getClassroomMap().put(newClassroom.getClassroomID(), newClassroom);
		return "Added new classroom";
	}

	@Override
	public String deleteClassroom(int classroomID) {
		if(this.getClassroomMap().containsKey(classroomID)) {
			this.getClassroomMap().remove(classroomID);
			return "Classroom with ID " + classroomID + " removed.";
		}
		
		else {
			return "Classroom does not exist";
		}
	}

	@Override
	public String updateClassroom(int classroomID, String classroom) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public Map<Integer, Classroom> getClassroomMap() {
		return classroomMap;
	}

}
