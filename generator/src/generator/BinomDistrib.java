package generator;

public class BinomDistrib implements Generator {

	private int n;
	private double p;
	private Generator gen;
	
	public BinomDistrib(int n, float p, Generator gen) {
		
		this.n = n;
		this.p = p;
		this.gen = gen;
	}

	@Override
	public float next() {
		
		int x = 0;
		for(int i = 0; i < n; i++) {
			float u = gen.next();
			if (u < p) {
				x++;
			}
		}
		return (float) x/n;
	}
	
}
