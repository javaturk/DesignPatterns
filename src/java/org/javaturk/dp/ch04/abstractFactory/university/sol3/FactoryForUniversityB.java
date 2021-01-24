package org.javaturk.dp.ch04.abstractFactory.university.sol3;

public interface FactoryForUniversityB {
	
	Course createCourse();
	Professor createProfessor();
	Schedule createSchedule();
	Syllabus createSyllabus();
}
