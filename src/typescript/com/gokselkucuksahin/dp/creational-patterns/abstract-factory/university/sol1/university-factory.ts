import {Course} from "./course";
import {Professor} from "./professor";
import {Schedule} from "./schedule";
import {Syllabus} from "./syllabus";

export interface UniversityFactory {
  createCourse(): Course;

  createProfessor(): Professor;

  createSchedule(): Schedule;

  createSyllabus(): Syllabus;
}