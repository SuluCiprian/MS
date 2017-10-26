package generator;

public class Msc implements Generator{

	private int seed;
	
	public Msc () {
		//seed = 8764;
		seed = 1368;
	}
	
	public float next() {
		int m = seed * seed;
		int first, second, third, fourth;
		int nrCifreSeed = 4;
		int p = (int) Math.pow(10, nrCifreSeed/ 2);
		int n =  (int) ((m / p) % Math.pow(10, nrCifreSeed));
		
		
		if (n < 1000) {
			n += 1000;
		}
		
		
		if(n % 10 == 0) {
			n += 1;
		}
		if (n % 100 == 0) {
			n += n / 100 + 11;
		}
		
		first = (n / 1000) % 10;
		second = (n / 100) % 10;
		if (first == second) {
			n += 100;
		}
		
		second = (n / 100) % 10;
		third = (n / 10) % 10;
		if (second == third) {
			n += 10;
		}
		
		third = (n / 10) % 10;
		fourth = n % 10;
		if(third == fourth) {
			n += 1;
		}
		seed = n;
		return (float)n/10000;
	}

	
}
