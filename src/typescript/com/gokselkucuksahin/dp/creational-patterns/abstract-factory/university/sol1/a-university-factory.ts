import {UniversityFactory} from "./university-factory";
import {Course} from "./course";
import {Professor} from "./professor";
import {Schedule} from "./schedule";
import {Syllabus} from "./syllabus";

export class AUniversityFactory implements UniversityFactory {
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