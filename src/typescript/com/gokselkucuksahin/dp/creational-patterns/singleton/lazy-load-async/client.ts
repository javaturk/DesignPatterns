import {LazyLoadSingleton} from "../lazy-load/lazyload-singleton";

const delay = async (ms) => new Promise(_ => setTimeout(_, ms));

const timeout = async () => {
  await delay(1000);
  return LazyLoadSingleton.getInstance();
}

const create = async () => {
  const arrayOfPromise: Promise<LazyLoadSingleton>[] = [];
  for (let i = 0; i < 100; i++) {
    arrayOfPromise.push(timeout());
  }
  return await Promise.all(arrayOfPromise);
}

(async _ => {
  console.time("Elapsed");
  console.log("Start 🔫");
  const array = await create();
  array.forEach(item => {
    item.say();
  })
  console.log("Stop 🏁");
  console.timeEnd("Elapsed");
})();