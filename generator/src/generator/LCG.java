package generator;

public class LCG implements Generator{

	private int seed;
	private int a;
	private int m;
	private int c;
	
	public LCG() {
		seed = 19;
		a = 22;
		m = 63;
		c = 4;
	}
	
	@Override
	public float next() {
		this.seed  = (a*seed+c) % m;
		return (float) this.seed / 100;
	}

}
