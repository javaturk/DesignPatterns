import {Singleton} from "./singleton";

console.log("Static pre-load Singleton");
const instances: Array<Singleton> = [];
for (let i = 0; i < 100; i++) {
  instances.push(Singleton.getInstance());
}
instances.forEach(single => {
  single.say();
});

const first = instances[0];
const [last] = instances.slice(-1);

if (first === last) {
  console.log("Object Instances are SAME");
} else {
  console.log("Object Instances are NOT SAME");
}