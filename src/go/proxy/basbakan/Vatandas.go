package basbakan


type Vatandas struct {
	basbakan Basbakan
	basbakanlikKalemi *BasbakanlikKalemi
}

func (vatandas *Vatandas) SetKalem(kalem *BasbakanlikKalemi){
	vatandas.basbakanlikKalemi = kalem
	vatandas.basbakan = vatandas.basbakanlikKalemi.BanaBasbakaniVer()
}

func (vatandas *Vatandas) DerdiniAnlat() string {
	vatandas.basbakan.DertDinle("Köyümüze lise istiyoruz.")
	return "Yasasiiinnn!!!"
}

func (vatandas *Vatandas) IsIste() string {
	vatandas.basbakan.IsBul("Oglum")
	return "Yuppiii!!!"
}

