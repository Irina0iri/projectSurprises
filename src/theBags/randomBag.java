package theBags;
import java.util.Random;
import java.util.ArrayList;
import surprise.Candies;
import surprise.FortuneCookie;
import surprise.MinionToy;
import surprise.Surprize;
import Interfaces.IBag;
import Interfaces.Isurprise;

public class randomBag extends BagFactory implements IBag{
	
	FortuneCookie cookie = new FortuneCookie("theMsg");
	Candies candy = new Candies();
	MinionToy toy = new MinionToy();
	ArrayList <Surprize> random = new ArrayList();
	
	@Override
	public void put(Isurprise newSurprise) {
		for (int i = 0; i < this.random.size(); i++) {
			if (random.get(i) == null) {
				this.random.add(i, (Surprize) newSurprise);
			}
		}
	}
	
	
	@Override
	public void put(IBag bagOfSurprises) {
		while(!this.random.isEmpty()) {
			int i = 0;
			((ArrayList<IBag>) bagOfSurprises).add((IBag) this.random.get(i));
			this.random.remove(i);
			i++;
		}
		
	}
	
	@Override
	public Isurprise takeOut() {
		if(!isEmpty()) {
			Random radN = new Random();
			int placeOfSur = radN.nextInt(random.size() - 1);
			Surprize theLuck = this.random.get(placeOfSur);
			this.random.remove(theLuck);
			return theLuck;
		}
		return null;
	}
	
	@Override
	public boolean isEmpty() {
		if(random.isEmpty()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int size() {
		if(!isEmpty()) {
			return this.random.size();
		}
		return 0;
	}
	

}
