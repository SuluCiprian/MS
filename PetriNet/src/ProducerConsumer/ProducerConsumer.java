package ProducerConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.petri.net.Arc;
import com.petri.net.Location;
import com.petri.net.PetriNet;
import com.petri.net.Transition;

public class ProducerConsumer extends PetriNet {

	public ProducerConsumer() {
		Location producer = new Location("P", 5);
		Location consumer = new Location("C", 7);
		Location prodDataReady = new Location("PDR", 0);
		Location consDataReady = new Location("CDR", 0);
		Location freePositions = new Location("FREE", 4);
		Location occupiedPositions = new Location("FULL", 0);
		Location mutex = new Location("MUTEX", 1);

		List<Transition> producerConsumerTransitions = new ArrayList<>();

		Arc prodOut = new Arc(producer, "out", 1);
		Arc prodIn = new Arc(producer, "in", 1);
		Arc prodDataIn = new Arc(prodDataReady, "in", 1);
		Arc prodDataOut = new Arc(prodDataReady,"out", 1);
		Arc freeOut = new Arc( freePositions, "out", 1);
		Arc freeIn = new Arc(freePositions, "in", 1);
		Arc mutexOut = new Arc(mutex, "out", 1);
		Arc mutexIn = new Arc(mutex,"in", 1);
		Arc fullIn = new Arc(occupiedPositions, "in", 1);
		Arc fullOut = new Arc(occupiedPositions, "out", 1);
		Arc consOut = new Arc( consumer, "out", 1);
		Arc consIn = new Arc(consumer, "in", 1);
		Arc consDataIn = new Arc(consDataReady, "in", 1);
		Arc consDataOut = new Arc(consDataReady, "out", 1);

		List<Arc> pushArcs = new ArrayList<>();
		pushArcs.add(prodDataOut);
		pushArcs.add(freeOut);
		pushArcs.add(mutexOut);
		pushArcs.add(prodIn);
		pushArcs.add(fullIn);
		pushArcs.add(mutexIn);
		producerConsumerTransitions.add(new Transition("push", pushArcs));

		List<Arc> popArcs = new ArrayList<>();
		popArcs.add(fullOut);
		popArcs.add(mutexOut);
		popArcs.add(consOut);
		popArcs.add(consDataIn);
		popArcs.add(freeIn);
		popArcs.add(mutexIn);
		producerConsumerTransitions.add(new Transition("pop", popArcs));

		Transition produce = new Transition("produce", Arrays.asList(prodOut, prodDataIn));
		Transition consume = new Transition("consume", Arrays.asList(consDataOut, consIn));
		producerConsumerTransitions.add(produce);
		producerConsumerTransitions.add(consume);

		this.transitions = producerConsumerTransitions;

	}

	@Override
	public void message(String action) {
		System.out.println(action);
	}

}