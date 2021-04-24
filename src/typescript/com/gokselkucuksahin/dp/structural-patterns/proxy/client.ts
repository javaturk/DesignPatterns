import {Basbakan} from "./basbakan";
import {GercekBasbakan} from "./gercekbasbakan";
import {Vatandas} from "./vatandas";
import {BasbakanlikKalemi} from "./basbakanlikkalemi";

const basbakan: Basbakan = new GercekBasbakan();
const basbakanlikKalemi = new BasbakanlikKalemi(basbakan);

const riza = new Vatandas(basbakanlikKalemi);
riza.derdiniAnlat("Bir derdim var...");
riza.isIste("Oğlum...");