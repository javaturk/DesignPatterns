import {FactoryForUniversityB} from "./factory-for-university-b";
import {Course} from "../sol1/course";
import {Professor} from "../sol1/professor";
import {Schedule} from "../sol1/schedule";
import {Syllabus} from "../sol1/syllabus";
import {VirtualClassroom} from "./virtual-classroom";

export class BUniversityFactory implements FactoryForUniversityB {
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

  createVirtualClassromm(): VirtualClassroom {
    return undefined;
  }

}