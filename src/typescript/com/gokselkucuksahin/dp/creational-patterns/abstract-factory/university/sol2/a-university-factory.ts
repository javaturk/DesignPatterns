import {FactoryForUniversityA} from "./factory-for-university-a";
import {Course} from "../sol1/course";
import {Professor} from "../sol1/professor";
import {Schedule} from "../sol1/schedule";
import {Syllabus} from "../sol1/syllabus";

export class AUniversityFactory implements FactoryForUniversityA {
  createCourse(): Course {
    return undefined;
  }

  createProfessor(): Professor {
    return undefined;
  }

  createSchedule(): Schedule {
    return undefined;
  }

  createSyllabus(): Syllabus {
    return undefined;
  }

}