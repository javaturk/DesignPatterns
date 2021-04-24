"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const lazyload_singleton_1 = require("./lazyload-singleton");
console.log("Lazy Load Singleton");
const instances = [];
for (let i = 0; i < 100; i++) {
    instances.push(lazyload_singleton_1.LazyLoadSingleton.getInstance());
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