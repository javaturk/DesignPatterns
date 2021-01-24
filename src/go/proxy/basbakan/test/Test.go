package main

import (
	. "structural/proxy/basbakan"
	//"fmt"
)


func main() {
	/*vatandas := new(Vatandas)

	var answer = vatandas.DerdiniAnlat()
	fmt.Println(answer)

	answer = vatandas.IsIste()
	fmt.Println(answer)

	fmt.Println()

	gercekBasbakan := new(GercekBasbakan)
	gercekBasbakan.Name = "Akin"
	fmt.Println(gercekBasbakan.Name)
	gercekBasbakan.DertDinle("Bir derdim var")
	gercekBasbakan.IsBul("Oglum")

	fmt.Println()

	vekilBasbakan := new(VekilBasbakan)
	vekilBasbakan.Init(gercekBasbakan)
	vekilBasbakan.DertDinle("XX")
	vekilBasbakan.IsBul("yy")

	basbakanlikKalemi := new(BasbakanlikKalemi)
	basbakanlikKalemi.Init(gercekBasbakan)*/

	var basbakan1 Basbakan = new(VekilBasbakan)
	basbakan1.DertDinle("Dert...")
	basbakan1.IsBul("oglum")

	var basbakan2 Basbakan = new(GercekBasbakan)
	basbakan2.DertDinle("Dert...")
	basbakan2.IsBul("oglum")
}


