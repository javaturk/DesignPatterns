package basbakan

import "fmt"

type GercekBasbakan struct{
	Name string

}

func (gb *GercekBasbakan) DertDinle(dert string){
	fmt.Println("Basbakan: Dinliyorum.")
}

func (gb *GercekBasbakan) IsBul(yakinim string){
	fmt.Println("Basbakan: Bana boyle isteklerle gelmeyin.")
}
