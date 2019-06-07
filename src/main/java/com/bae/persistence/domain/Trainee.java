package com.bae.persistence.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int traineeID;
	private String traineeName;
	@ManyToOne (cascade=CascadeType.ALL)
	private Classroom classroom;
	
	
	// default constructor
	public Trainee() {
		super();
	}
	
	public Trainee(int traineeID, String traineeName) {
		this.traineeID = traineeID;
		this.traineeName = traineeName;
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
	
	

}
