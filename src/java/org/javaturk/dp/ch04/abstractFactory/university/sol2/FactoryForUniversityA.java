package org.javaturk.dp.ch04.abstractFactory.university.sol2;

public interface FactoryForUniversityA {
	
	Course createCourse();
	Professor createProfessor();
	Schedule createSchedule();
	Syllabus createSyllabus();
}
