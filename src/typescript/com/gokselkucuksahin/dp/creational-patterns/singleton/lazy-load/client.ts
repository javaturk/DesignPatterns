import {LazyLoadSingleton} from "./lazyload-singleton";

console.log("Lazy Load Singleton");
const instances: Array<LazyLoadSingleton> = [];
for (let i = 0; i < 100; i++) {
  instances.push(LazyLoadSingleton.getInstance());
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