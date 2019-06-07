package com.bae.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int traineeID;
	private String traineeName;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="classroomID")
	private Classroom classroom;
	
	
	// default constructor
	public Trainee() {
		super();
	}
	
	public Trainee(int traineeID, String traineeName, Classroom classroom) {
		this.traineeID = traineeID;
		this.traineeName = traineeName;
		this.classroom = classroom;
	}

	
	
	
	
	
	public int getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	
	

}
