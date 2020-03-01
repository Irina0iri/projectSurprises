package surprise;
import Interfaces.Isurprise;

public class FortuneCookie extends Surprize implements Isurprise{
	
	static String [] theQuote = new String[] {
			"The fortune you seek is in another cookie. ",
			"A conclusion is simply the place where you got tired of thinking.",
			"A cynic is only a frustrated optimist.",
			"A foolish man listens to his heart. A wise man listens to cookies." ,
			"You will die alone and poorly dressed.",
			"A fanatic is one who can't change his mind, and won't change the subject.",
			"You will live long enough to open many fortune cookies.",
			"Some men dream of fortunes, others dream of cookies.",
			"The world may be your oyster, but it doesn't mean you'll get its pearl.",
			"The road to riches is paved with homework.",
			"You can always find happiness at work on Friday.",
			"Actions speak louder than fortune cookies.",
			"Help! I am being held prisoner in a fortune cookie factory.",
			"Only listen to the fortune cookie; disregard all other fortune telling units.",
			"No snowflake feels responsible in an avalanche.",
			"Hard work pays off in the future. Laziness pays off now.",
			"Change is inevitable, except for vending machines.",
			"There is no mistake so great as that of being always right.",
			"Someone will invite you to a Karaoke party.",
			"You will be hungry again in one hour."};

	static String theMsg = theQuote[random.nextInt(19)];
	
	
	public FortuneCookie(String theMsg) {
		theMsg = FortuneCookie.theMsg ;
	}
	
	public static void generate() {
		System.out.println("your suprize generate message: "  + theMsg);
		
	}
	
	@Override
	public void enjoy () {
		System.out.println("The divinity have a message for you. ");
	}
	
	
	
	public FortuneCookie() {
		
	}
	
}