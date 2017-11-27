package com.coffee.machine;

import java.util.HashMap;

public class StateMachine {

	protected String currentState;
	protected HashMap<String, HashMap<String, String>> table;

	public void transition(String action) {
		if (table.get(currentState).get(action) != null) {
			currentState = table.get(currentState).get(action);
			showMessage(action);
		} 
	}
	public void showMessage(String  action) {
	
	}
}
