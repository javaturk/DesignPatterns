package basbakan

import "fmt"

type BasbakanlikKalemi struct{

	vekilBasbakan *VekilBasbakan

}

func (bk *BasbakanlikKalemi) Init(gb *GercekBasbakan) {
	bk.vekilBasbakan = new(VekilBasbakan)
	bk.vekilBasbakan.Init(gb)
}

func (bk *BasbakanlikKalemi) BanaBasbakaniVer() Basbakan{
	fmt.Println("Başbakanlık Kalemi: Tabi efendim");
	return bk.vekilBasbakan;
}
