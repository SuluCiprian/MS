package com.ReaderWriter;

import java.util.Arrays;

import com.petri.net.Arc;
import com.petri.net.Location;
import com.petri.net.PetriNet;
import com.petri.net.Transition;

public class ReaderWriter extends PetriNet {

	public ReaderWriter() {
		Location idle = new Location("workers", 5);
		Location reading = new Location("reading", 0);
		Location writing = new Location("writing", 0);

		Arc idleReadOut = new Arc(idle, "out", 1);
		Arc idleReadIn = new Arc(reading, "in", 1);

		Arc readIdleOut = new Arc(reading, "out", 1);
		Arc readIdleIn = new Arc(idle, "in", 1);

		Arc idleWriteOut = new Arc(idle, "out", 5);
		Arc idleWriteIn = new Arc(writing, "in", 1);

		Arc writeIdleOut= new Arc(writing, "out", 1);
		Arc writeIdleIn = new Arc(idle, "in", 5);

		Transition startReading = new Transition("startReading", Arrays.asList(idleReadOut, idleReadIn));
		Transition endReading = new Transition("endReading", Arrays.asList(readIdleOut, readIdleIn));
		Transition startWriting = new Transition("startWriting", Arrays.asList(idleWriteOut, idleWriteIn));
		Transition endWriting = new Transition("endWriting", Arrays.asList(writeIdleOut, writeIdleIn));

		this.transitions = Arrays.asList(startReading, endReading, startWriting, endWriting);
	}

	@Override
	public void message(String action) {

		switch (action) {
		case "startReading":
			System.out.println("Started reading");
			break;
		case "endReading":
			System.out.println("Stopped reading");
			break;
		case "startWriting":
			System.out.println("Started Writing");
			break;
		case "endWriting":
			System.out.println("Stopped Writing");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}

}
