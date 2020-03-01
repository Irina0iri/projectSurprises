package theBags;

import java.util.ArrayList;

import Interfaces.IBag;
import Interfaces.IBagFactory;
import Interfaces.Isurprise;
import surprise.Surprize;

public class BagFactory implements IBagFactory, IBag {
	ArrayList <Surprize> bagFactory = new ArrayList<Surprize>();
	
	public BagFactory (String type) {
		makeBag(type);
	}

	public BagFactory() {
		
	}

	@Override
	public IBag makeBag(String type) {
		if(type.equals("BagFIFO")){
			BagFIFO fifoB = new BagFIFO();
			return fifoB;
		}else if (type.equals("bagLIFO")) {
			bagLIFO lifoB = new bagLIFO();
			return lifoB;
		}else if (type.equals("random")) {
			randomBag rand = new randomBag();
			return rand;
		}else {
			System.out.println("type of bag was not found");
		}
		return null;
	}
	
	@Override
	public void put(Isurprise newSurprise) {
		for (int i = 0; i < this.bagFactory.size(); i++) {
			if (bagFactory.get(i) == null) {
				this.bagFactory.add(i, (Surprize) newSurprise);
			}
		}
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while(!this.bagFactory.isEmpty()) {
			int i = 0;
			((ArrayList<IBag>) bagOfSurprises).add((IBag) this.bagFactory.get(i));
			this.bagFactory.remove(i);
			i++;
		}
		
	}

	@Override
	public Isurprise takeOut() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(bagFactory.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		if(!isEmpty()) {
			return this.bagFactory.size();
		}
		return 0;
	}
	
}
