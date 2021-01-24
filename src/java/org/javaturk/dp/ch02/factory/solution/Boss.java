package org.javaturk.dp.ch02.factory.solution;

public class Boss implements Worker{
	
	public void youWorkToo(){
		System.out.println("Boss is working for you :)");
	}

	@Override
	public void work() {
		youWorkToo();
	}
}
