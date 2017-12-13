package com.main;

import ProducerConsumer.ProducerConsumer;

public class MainProducerConsumer {

	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer();
		pc.execute("Produce");
		pc.execute("Push");
		pc.execute("Pop");
		pc.execute("Consume");
	}

}
