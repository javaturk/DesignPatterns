package basbakan

import "fmt"

type VekilBasbakan struct{
	gercekBasbakan *GercekBasbakan
}

func (vb *VekilBasbakan) Init(gb *GercekBasbakan) *VekilBasbakan{
	vb.gercekBasbakan = gb
	return vb
}

func (vb *VekilBasbakan) DertDinle(dert string){
	fmt.Println("\nVekil: Derdinizi dinliyorum.")
	var ayiklandi bool = vb.ayikla(dert)
	if ayiklandi {
		vb.ilet(dert)
	}
}

func (vb *VekilBasbakan) IsBul(yakinim string){
	//vb.gercekBasbakan.IsBul(yakinim)
	fmt.Println("\nVekil: İsteğinizi dinliyorum.")
	//fmt.Println("Basbakan: Dinliyorum.")
}

func (vb *VekilBasbakan) ayikla(dert string) bool {
 	var b bool = true
	// Bütün kontroller burada!
	return b
}

func  (vb *VekilBasbakan) ilet(dert string) {
	vb.gercekBasbakan.DertDinle(dert)
}