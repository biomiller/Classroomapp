package com.bae.ClassroomMapTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bae.persistence.repository.ClassroomMapRepository;
import com.bae.util.Constants;
import com.bae.util.JSONUtil;

public class ClassroomMapTest {

	JSONUtil jsonutil;
	ClassroomMapRepository testCMR;

	@Before
	public void setup() {

		jsonutil = new JSONUtil();
		testCMR = new ClassroomMapRepository();
	}

	@Test
	public void addClassroomTest() {
		testCMR.createClassroom(Constants.CLASS1);

		assertTrue(1 == testCMR.getClassroomMap().size());
	}

	@Test
	public void add2ClassroomsTest() {
		testCMR.createClassroom(Constants.CLASS1);
		testCMR.createClassroom(Constants.CLASS2);
		assertTrue(2 == testCMR.getClassroomMap().size());
	}

	@Test
	public void getClassroomTest() {
		testCMR.createClassroom(Constants.CLASS1);
		testCMR.createClassroom(Constants.CLASS2);

		assertEquals(Constants.CLASS1, testCMR.getClassroom(1));

	}

	@Test
	public void deleteClassroomTest() {

		testCMR.createClassroom(Constants.CLASS1);
		testCMR.createClassroom(Constants.CLASS2);

		testCMR.deleteClassroom(1);

		assertTrue(1 == testCMR.getClassroomMap().size());

	}

}
