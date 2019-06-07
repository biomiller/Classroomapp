package com.bae.persistence.repository;

public interface ClassroomRepository {
	
	String getClassroom(int classroomID);
	String createClassroom(String classroom);
	String deleteClassroom(int classroomID);
	String updateClassroom(int classroomID, String classroom);

}
