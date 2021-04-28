import {Course} from "../sol1/course";
import {Professor} from "../sol1/professor";
import {Schedule} from "../sol1/schedule";
import {Syllabus} from "../sol1/syllabus";

export interface FactoryForUniversityA {
  createCourse(): Course;

  createProfessor(): Professor;

  createSchedule(): Schedule;

  createSyllabus(): Syllabus;
}