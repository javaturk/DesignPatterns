"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EmployeeRandomizer = void 0;
class EmployeeRandomizer {
    static getRandomInt(min, max) {
        return ~~(Math.random() * (max - min) + min);
    }
    static createId() {
        return this.getRandomInt(0, 100_000);
    }
    static createName() {
        const randomIndex = this.getRandomInt(0, this.firstNames.length);
        return this.firstNames[randomIndex];
    }
    static createDepartment() {
        const randomIndex = this.getRandomInt(0, this.departments.length);
        return this.departments[randomIndex];
    }
    static createYear() {
        return this.getRandomInt(1, 20);
    }
}
exports.EmployeeRandomizer = EmployeeRandomizer;
EmployeeRandomizer.firstNames = ["Ali", "Ayse", "Bahar", "Bekir", "Bulent", "Can", "Cem", "Demet", "Elif",
    "Eylem", "Faruk", "Fatma", "Ganime", "Gulsum", "Haydar", "Halil", "Ismail", "Jale", "Kemal", "Leman",
    "Mehmet", "Mihrimah", "Murat", "Mustafa", "Nedim", "Nilufer", "Selim", "Selman", "Sevda", "S¸leyman",
    "Tarik", "Teoman", "Turgut", "Yeliz", "Zuhal"];
EmployeeRandomizer.departments = ["Production", "Sales", "Marketing", "Engineering"];
//# sourceMappingURL=employee-randomizer.js.map