package org.javaturk.dp.ch05.decorator.toast.pattern;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
//		test.makeAyvalıkToast1();
		test.makeAyvalıkToast2();
	}
	
	public void makeAyvalıkToast1(){
		Toastable ayvalıkToast = new ToastBread("Toast bread", 5);
		System.out.println("Cost: " + ayvalıkToast.calculatePrice());
		printToppings(ayvalıkToast);
		ayvalıkToast = new Cheese(ayvalıkToast, "Cheddar cheese", 3);
		System.out.println("Cost: " + ayvalıkToast.calculatePrice());
		printToppings(ayvalıkToast);
		ayvalıkToast = new Sausage(ayvalıkToast, "Sucuk", 3);
		System.out.println("Cost: " + ayvalıkToast.calculatePrice());
		printToppings(ayvalıkToast);
		ayvalıkToast = new Tomato(ayvalıkToast, "Tomato", 2);
		System.out.println("Cost: " + ayvalıkToast.calculatePrice());
		printToppings(ayvalıkToast);
		ayvalıkToast = new Ketchup(ayvalıkToast, "Ketchup", 1);
		System.out.println("Cost: " + ayvalıkToast.calculatePrice());
		printToppings(ayvalıkToast);
		ayvalıkToast = new Salad(ayvalıkToast, "Russian salad", 2);
		System.out.println("Cost: " + ayvalıkToast.calculatePrice());
		printToppings(ayvalıkToast);
	}
	
	public void makeAyvalıkToast2(){
		Toastable ayvalıkToast = new ToastBread("Toast bread", 5);
		ayvalıkToast = new Cheese(ayvalıkToast, "Cheddar cheese", 3);
		ayvalıkToast = new Sausage(ayvalıkToast, "Sucuk", 3);
		ayvalıkToast = new Tomato(ayvalıkToast, "Tomato", 2);
		ayvalıkToast = new Ketchup(ayvalıkToast, "Ketchup", 1);
		ayvalıkToast = new Salad(ayvalıkToast, "Russian salad", 2);
		System.out.println("\nCost: " + ayvalıkToast.calculatePrice());
		
		printToppings(ayvalıkToast);
	}

	private void printToppings(Toastable tost) {
		for(Topping topping : tost.getToppings())
			System.out.println(topping);
	}
}
