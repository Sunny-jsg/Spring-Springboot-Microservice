package com.in.ashokit;

public class App {

	public static void main(String[] args) {
		Car c = new Car(new DieselEngine());
		//c.setEng(new DieselEngine());
		//c.eng =new PetrolEngine();
		c.drive();

	}

}
