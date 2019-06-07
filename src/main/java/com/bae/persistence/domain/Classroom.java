package com.bae.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classroomID;
	private String trainer;
	@OneToMany(mappedBy="classroom",cascade = CascadeType.ALL)
	private Set<Trainee> trainees = new HashSet<Trainee>();
	
	// default constructor
	
	public Classroom() {
		super();
	}
	
	
	public Classroom(int classroomID, String trainer) {
		super();
		this.classroomID = classroomID;
		this.trainer = trainer;
		//this.trainees = trainees;
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

	public Set<Trainee> getTrainees() {
		return trainees;
	}


}
