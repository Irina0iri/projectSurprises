package surprise;

public final class GatherSurprises {
	static Surprize [] arrOfS ;
	static int size = Surprize.random.nextInt(arrOfS.length);
	
	private GatherSurprises() {
		
	}
	
	public static Surprize [] gather (int n) {
		Surprize [] gather = new Surprize[n];
		return gather;
	}
	
	public static Surprize gather() {
		Surprize a = new Surprize ();
		return a;
	}
	
	public static void randomGenerator() {
		if(size % 3 == 1) {
			System.out.println("suprize will be a Fortune cookie ");
			FortuneCookie.generate();
		}else if (size % 3 == 2) {
			System.out.println("suprize will contain Canies ");
			Candies.generate();
		}else if (size % 3 == 0) {
			System.out.println("suprprize will be a minion ");
			MinionToy.generate();
		}
	}
	
}
