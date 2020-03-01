package surprise;

import java.util.concurrent.TimeUnit;
import Interfaces.IBag;
import Interfaces.IBagFactory;
import Interfaces.Isurprise;
import theBags.BagFIFO;
import theBags.BagFactory;
import theBags.bagLIFO;

public abstract class giveSurprises implements IBagFactory, IBag{
	int waitTime;
	IBag container = new BagFactory();
	
	public giveSurprises (String bagType, int waitTime) {
		BagFactory surpriseBag = new BagFactory(bagType);
	}
	
	public void put (Isurprise newSurprise) {
		this.container.put(newSurprise);
	}
	
	public void put(IBag surprise) {
		this.container.put(surprise);
	}
	
	public void give() {
		this.container.takeOut();
		giveWithPassion();
		
	}
	
	public void giveAll() {
		try {
			  TimeUnit.SECONDS.sleep(this.waitTime); 
			} 
		catch (InterruptedException e) {
			
			  e.printStackTrace();
			}
		giveWithPassion();
	}
	
	public boolean isEmpty() {
		if(this.container.isEmpty())
			return true;
		return false;
	}
	
	abstract void giveWithPassion();
}
