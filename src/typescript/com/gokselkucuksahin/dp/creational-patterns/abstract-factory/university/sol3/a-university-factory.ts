import {FactoryForUniversityA} from "./factory-for-university-a";
import {Course} from "../sol1/course";
import {Professor} from "../sol1/professor";
import {Schedule} from "../sol1/schedule";
import {Syllabus} from "../sol1/syllabus";

export class AUniversityFactory implements FactoryForUniversityA {
  createCourse(name: string): Course {
    return undefined;
  }

  createProfessor(name: string): Professor {
    return undefined;
  }

  createSchedule(name: string): Schedule {
    return undefined;
  }

  createSyllabus(name: string): Syllabus {
    return undefined;
  }

}