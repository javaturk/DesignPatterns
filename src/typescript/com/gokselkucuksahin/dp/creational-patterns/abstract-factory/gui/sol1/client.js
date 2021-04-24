"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Client = void 0;
class Client {
    constructor(factory) {
        const component = factory.create();
        component.paint();
    }
}
exports.Client = Client;
//# sourceMappingURL=client.js.map