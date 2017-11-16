package generator;

public class Random1 implements Generator {

	@Override
	public float next() {
		
		return (float) Math.random();
	}

}
