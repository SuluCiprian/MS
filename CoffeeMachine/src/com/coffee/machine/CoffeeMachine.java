package com.coffee.machine;

import java.util.HashMap;

public class CoffeeMachine extends StateMachine {

	CoffeeMachine() {
		this.currentState = "0";
		this.table = fillTable();

	}

	public HashMap<String, HashMap<String, String>> fillTable() {
		HashMap<String, HashMap<String, String>> mainTable = new HashMap<String, HashMap<String, String>>();

		HashMap<String, String> table1 = new HashMap<String, String>();
		table1.put("5", "5");
		table1.put("10", "10");
		mainTable.put("0", table1);

		HashMap<String, String> table2 = new HashMap<String, String>();
		table2.put("5", "10");
		table2.put("10", "15");
		mainTable.put("5", table2);

		HashMap<String, String> table3 = new HashMap<String, String>();
		table3.put("C10", "0");
		table3.put("5", "15");
		mainTable.put("10", table3);

		HashMap<String, String> table4 = new HashMap<String, String>();
		table4.put("C15", "0");
		table4.put("C10", "5");
		mainTable.put("15", table4);

		return mainTable;
	}

	@Override
	public void showMessage(String action) {
		if (action.equals("C10") || action.equals("C15")) {
			System.out.println("Coffee " + action + " Finished");
		}
		System.out.println("Credit: " + currentState);
	}
}
