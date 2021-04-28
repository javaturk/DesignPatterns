import {VirtualClassroom} from "./virtual-classroom";
import {Course} from "../sol1/course";
import {Professor} from "../sol1/professor";
import {Schedule} from "../sol1/schedule";
import {Syllabus} from "../sol1/syllabus";

export interface FactoryForUniversityB {
  createCourse(): Course;

  createProfessor(): Professor;

  createSchedule(): Schedule;

  createSyllabus(): Syllabus;

  createVirtualClassromm(): VirtualClassroom;
}