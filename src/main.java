import Interfaces.Isurprise;
import surprise.GatherSurprises;
import surprise.Surprize;
import theBags.BagFIFO;
import theBags.BagFactory;

public class main {
	public static void main (String [] args) {
		Surprize a = new Surprize();
		Isurprise c = new Surprize();
		BagFactory b = new BagFactory("BagFIFO");
		a.enjoy();
		a.generate();
		
		
	}
}
