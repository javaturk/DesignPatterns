package org.javaturk.dp.ch04.abstractFactory.university.sol2;

public interface FactoryForUniversityB {
	
	Course createCourse();
	Professor createProfessor();
	Schedule createSchedule();
	Syllabus createSyllabus();
	VirtualClassroom createVirtualClassroom();
}
