package com.main;

import com.coffeeMachine.CoffeeMachine;

public class MainCoffeePetri {

	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		coffeeMachine.execute("5");
		coffeeMachine.execute("10");
		coffeeMachine.execute("c10");
	}
}
