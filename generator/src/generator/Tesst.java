package generator;

public class Tesst {

	public static void main(String[] args) {
		
		Random1 rand = new Random1();
		Msc msc = new Msc();
		for (int i =1; i<=100;i++)
		System.out.println("Numarul msc: " +  msc.next());
		LCG lcg = new LCG();
		for (int i =1; i<=100;i++)
		System.out.println("Numarul LGC: " + lcg.next());
		Evaluator ev = new Evaluator(rand);
		System.out.println("Evaluare generator:" + ev.eval());
		
		
		BinomDistrib bd = new BinomDistrib(100,0.5f,lcg);
		System.out.println("Distrib binomiala: " + bd.next());
		
		PoissonDistrib pd = new PoissonDistrib(0.8f, 100, msc);
		System.out.println("Distributie Poisson: " + pd.next());
		
	}

}
