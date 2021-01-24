package main

import (
	. "structural/proxy/basbakan"
)

func main() {
	var basbakan = new(GercekBasbakan)
	var kalem = new(BasbakanlikKalemi)
	kalem.Init(basbakan)

	var riza = new(Vatandas)
	riza.SetKalem(kalem)

	riza.DerdiniAnlat()
	riza.IsIste()
}
