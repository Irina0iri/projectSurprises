package Interfaces;

public interface IBag {
	
	void put(Isurprise newSurprise);
	void put (IBag bagOfSurprises);
	Isurprise takeOut();
	boolean isEmpty();
	int size();
	
}
