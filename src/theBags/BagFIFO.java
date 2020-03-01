package theBags;

import java.util.ArrayList;

import Interfaces.IBag;
import Interfaces.Isurprise;
import surprise.Candies;
import surprise.FortuneCookie;
import surprise.MinionToy;
import surprise.Surprize;

public class BagFIFO extends BagFactory implements IBag{
	
	FortuneCookie cookie = new FortuneCookie("theMsg");
	Candies candy = new Candies();
	MinionToy toy = new MinionToy();
	ArrayList <Surprize> fIn = new ArrayList<Surprize>();

	@Override
	public void put(Isurprise newSurprise) {
		super.put(newSurprise);
		
	}

	@Override
	public void put(IBag bagOfSurprises) {
		super.put(bagOfSurprises);
	}

	@Override
	public Isurprise takeOut() {
		if (!isEmpty()) {
			fIn.trimToSize();
			Surprize theSur = fIn.get(fIn.size() - 1);
			this.fIn.remove(theSur);
			return theSur;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		super.isEmpty();
		return false;
	}

	@Override
	public int size() {
		super.size();
		return 0;
	}
	

}
