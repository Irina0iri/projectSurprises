package theBags;

import java.util.ArrayList;
import Interfaces.IBag;
import Interfaces.Isurprise;
import surprise.Candies;
import surprise.FortuneCookie;
import surprise.MinionToy;
import surprise.Surprize;

public class bagLIFO extends BagFactory implements IBag {
	
	ArrayList <Surprize> lIn = new ArrayList();
	FortuneCookie cookie = new FortuneCookie("theMsg");
	Candies candy = new Candies();
	MinionToy toy = new MinionToy();

	@Override
	public void put(Isurprise newSurprise) {
		super.put(newSurprise);
		
	}

	@Override
	public void put(IBag bagOfSurprises) {
		//super sau this ?
		super.put(bagOfSurprises);
	}

	@Override
	public Isurprise takeOut() {
		if (!isEmpty()) {
			Surprize theSur = lIn.get(0);
			this.lIn.remove(theSur);
			return theSur;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		this.lIn.isEmpty();
		return false;
	}

	@Override
	public int size() {
		this.lIn.size();
		return 0;
	}
	
	
}
