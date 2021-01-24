package org.javaturk.dp.ch04.abstractFactory.university.sol1;

public interface UniversityFactory {
	
	Course createCourse();
	Professor createProfessor();
	Schedule createSchedule();
	Syllabus createSyllabus();

}
