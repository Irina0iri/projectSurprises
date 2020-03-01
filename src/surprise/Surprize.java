package surprise;
import java.util.Random;
import Interfaces.Isurprise;

public class Surprize implements Isurprise{
	
	String type;
	public static Random random = new Random();
	static int orderNo = random.nextInt(20);
	
	public Surprize(String type, int orderNo, int n) {
		this.type = type;
		Random randomNr = new Random();
		this.orderNo = randomNr.nextInt(n);
	}
	
	public Surprize() {
		
	}
	
	@Override
	 public void enjoy() {
		System.out.println("let's see what kind of surprise it is");
	}
	
	public static void generate() {
		if (orderNo % 3 == 0) {
			Candies.generate();
		}else if (orderNo % 3 == 1) {
			FortuneCookie.generate();
		}else {
			MinionToy.generate();
		}
		
		
	}

	
}
