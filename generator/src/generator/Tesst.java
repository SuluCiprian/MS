package generator;

public class Tesst {

	public static void main(String[] args) {
		Msc msc = new Msc();
		for (int i =1; i<=100;i++)
		System.out.println("Numarul msc: " +  msc.next());
		LCG lcg = new LCG();
		for (int i =1; i<=100;i++)
		System.out.println("Numarul LGC: " + lcg.next());
		Evaluator ev = new Evaluator(msc);
		System.out.println("Evaluare generator:" + ev.eval());
		
	}

}
