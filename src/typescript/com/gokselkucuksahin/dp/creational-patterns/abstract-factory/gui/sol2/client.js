"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Client = void 0;
class Client {
    constructor(factory) {
        const button = factory.createButton();
        button.paint();
        const list = factory.createList();
        list.paint();
        const table = factory.createTable();
        table.paint();
    }
}
exports.Client = Client;
//# sourceMappingURL=client.js.map