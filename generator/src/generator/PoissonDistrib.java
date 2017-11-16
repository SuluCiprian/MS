package generator;

public class PoissonDistrib implements Generator {

	private double lambda;
	private int n;
	private Generator gen;
	
	public PoissonDistrib(float lambda, int n, Generator gen) {
		this.lambda = lambda;
		this.n = n;
		this.gen = gen;
	}

	@Override
	public float next() {
		
		double L = (float) 1 / Math.exp(lambda);
		//double L = 1/Math.pow(Math.E, lambda);
		int k = 0;
		double p = 1;
		do {
			
			k++;
			float u = gen.next();
			p *= u;
		} while((p>L) && (k<n));
		return (float) (k-1) / n;
	}
	
	
}
