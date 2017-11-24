package com.coffee.machine;

import java.util.HashMap;

public abstract class StateMachine {

	protected String currentState;
	protected HashMap<String, HashMap<String, String>> table;

	public abstract void transition(String action);
}
