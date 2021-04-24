"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const singleton_1 = require("./singleton");
console.log("Static pre-load Singleton");
const instances = [];
for (let i = 0; i < 100; i++) {
    instances.push(singleton_1.Singleton.getInstance());
}
instances.forEach(single => {
    single.say();
});
const first = instances[0];
const [last] = instances.slice(-1);
if (first === last) {
    console.log("Object Instances are SAME");
}
else {
    console.log("Object Instances are NOT SAME");
}
//# sourceMappingURL=client.js.map