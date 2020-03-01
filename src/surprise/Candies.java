package surprise;

import Interfaces.Isurprise;

public class Candies extends Surprize implements Isurprise{
	
	static int choosenCandy = random.nextInt(3);
	static int noOfCand = random.nextInt(10);
	static String [] candies = new String[] {"chocolate", "jelly", "fruits", "vanilla"};
	
	@Override
	public void enjoy() {
		System.out.println(" Your candie suprize contain something you like");
	}
	
	public static void generate() {
		String noCandy = Integer.toString(noOfCand);
		String candyName = candies[choosenCandy];
		System.out.println("Snata knows that you like candies so you will get : " + noCandy +" " + candyName);
	}

	public Candies(int noOfCandies, String candieType) {
		System.out.println("Santa bring you " + noOfCandies + " " + candieType);
	}
	
	public Candies() {
		
	}
	
}
