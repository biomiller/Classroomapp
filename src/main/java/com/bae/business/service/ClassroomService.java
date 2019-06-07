package com.bae.business.service;

public interface ClassroomService {
	
	String getClassroom(int classroomID);
	String createClassroom(String classroom);
	String deleteClassroom(int classroomID);
	String updateClassroom(int classroomID, String classroom);

}
