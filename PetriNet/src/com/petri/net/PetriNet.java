package com.petri.net;

import java.util.ArrayList;
import java.util.List;

public abstract class PetriNet {

	protected List<Transition> transitions;

	public void execute(String action) {

		List<Transition> validTransitions = new ArrayList<Transition>();

		message(action);
		
		for (int i = 0; i < transitions.size(); i++) {
			if (transitions.get(i).getTag().equals(action) && transitions.get(i).isValid()) {
				validTransitions.add(transitions.get(i));
			}
		}

		for (Transition transition : validTransitions) {
			transition.update();
			//System.out.println("Credit: " + transition.getArcs().get(1).getLocation().getTag());
		}
	}

	public abstract void message(String action);
}
