"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const lazyload_singleton_1 = require("../lazy-load/lazyload-singleton");
const delay = async (ms) => new Promise(_ => setTimeout(_, ms));
const timeout = async () => {
    await delay(1000);
    return lazyload_singleton_1.LazyLoadSingleton.getInstance();
};
const create = async () => {
    const arrayOfPromise = [];
    for (let i = 0; i < 100; i++) {
        arrayOfPromise.push(timeout());
    }
    return await Promise.all(arrayOfPromise);
};
(async (_) => {
    console.time("Elapsed");
    console.log("Start 🔫");
    const array = await create();
    array.forEach(item => {
        item.say();
    });
    console.log("Stop 🏁");
    console.timeEnd("Elapsed");
})();
//# sourceMappingURL=client.js.map