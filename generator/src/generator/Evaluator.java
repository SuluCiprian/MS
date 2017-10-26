package generator;

public class Evaluator {

	private final float pi = 3.14f;
	private Generator gen;
	private int nrInCircle;
	
	public Evaluator(Generator gen) {
		this.gen=gen;
	}
	
	public float eval() {
		
		nrInCircle = 0;
		for (int i = 1; i <= 10000; i++) {
			float x = gen.next();
			float y = gen.next();
			if(Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
				nrInCircle++;
			}
		}
		float z = (4*nrInCircle)/10000;
		return (Math.abs(pi-z));
	}
	
	
}
