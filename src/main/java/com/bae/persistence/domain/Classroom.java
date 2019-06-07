package com.bae.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classroomID;
	private String trainer;
	private String trainees;
	
	// default constructor
	
	public Classroom() {
		super();
	}
	
	public Classroom(int classroomID, String trainer, String trainees) {
		this.classroomID = classroomID;
		this.trainer = trainer;
		this.trainees = trainees;
	}

	
	
	
	
	
	
	public int getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(int classroomID) {
		this.classroomID = classroomID;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getTrainees() {
		return trainees;
	}

	public void setTrainees(String trainees) {
		this.trainees = trainees;
	}
	

}
