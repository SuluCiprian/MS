package com.coffee.machine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		String action;
		System.out.println("Credit: 0");
		do {
			action = scanner.next();
			if (action.equals("5") || action.equals("10") || action.equals("C10") || action.equals("C15")) {
				coffeeMachine.transition(action);
			} else {
				if (!action.equals("x"))
					System.out.println("Invalid Action!");
			}
		} while (!action.equals("x"));
		System.out.println("Thank you!");
	}
}
