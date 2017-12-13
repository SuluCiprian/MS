package com.coffeeMachine;

import java.util.Arrays;

import com.petri.net.*;

public class CoffeeMachine extends PetriNet {

	public CoffeeMachine() {
		Location location0 = new Location("0", 1);
		Location location5 = new Location("5", 0);
		Location location10 = new Location("10", 0);
		Location location15 = new Location("15", 0);

		Arc arc0_5out = new Arc(location0, "out", 1);
		Arc arc0_5in = new Arc(location5, "in", 1);

		Arc arc0_10out = new Arc(location0, "out", 1);
		Arc arc0_10in = new Arc(location10, "in", 1);

		Arc arc5_10out = new Arc(location5, "out", 1);
		Arc arc5_10in = new Arc(location10, "in", 1);

		Arc arc5_15out = new Arc(location5, "out", 1);
		Arc arc5_15in = new Arc(location15, "in", 1);

		Arc arc10_15out = new Arc(location10, "out", 1);
		Arc arc10_15in = new Arc(location15, "in", 1);

		Arc arc10_0out = new Arc(location10, "out", 1);
		Arc arc10_0in = new Arc(location0, "in", 1);

		Arc arc15_5out = new Arc(location15, "out", 1);
		Arc arc15_5in = new Arc(location5, "in", 1);

		Arc arc15_0out = new Arc(location15, "out", 1);
		Arc arc15_0in = new Arc(location0, "in", 1);

		Transition transition_0_5_5 = new Transition("5", Arrays.asList(arc0_5out, arc0_5in));
		Transition transition_0_10_10 = new Transition("10", Arrays.asList(arc0_10out, arc0_10in));
		Transition transition_5_5_10 = new Transition("5", Arrays.asList(arc5_10out, arc5_10in));
		Transition transition_5_10_15 = new Transition("10", Arrays.asList(arc5_15out, arc5_15in));
		Transition transition_10_5_15 = new Transition("5", Arrays.asList(arc10_15out, arc10_15in));
		Transition transition_10_c10_0 = new Transition("c10", Arrays.asList(arc10_0out, arc10_0in));
		Transition transition_15_c10_5 = new Transition("c10", Arrays.asList(arc15_5out, arc15_5in));
		Transition transition_15_c15_0 = new Transition("c15", Arrays.asList(arc15_0out, arc15_0in));

		this.transitions = Arrays.asList(transition_0_5_5, transition_0_10_10, transition_5_5_10, transition_5_10_15,
				transition_10_5_15, transition_10_c10_0, transition_15_c10_5, transition_15_c15_0);
	}

	@Override
	public void message(String action) {
		// TODO Auto-generated method stub
		switch (action) {
		case "c10":
			System.out.println("C10");
			break;
		case "c15":
			System.out.println("C15");
			break;
		case "5":
			System.out.println("+ 5 Lei");
			break;
		case "10":
			System.out.println("+ 10 Lei");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
