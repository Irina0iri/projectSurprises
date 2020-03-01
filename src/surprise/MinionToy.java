package surprise;

import Interfaces.Isurprise;
public class MinionToy extends Surprize implements Isurprise{
	
	static String [] minions = new String[] {"Dave", "Carl", "Kevin" , "Stuart" , "Jerry" , "Tim"};
	static String type = "minionToy";
	static int b = 0;
	
	@Override
	public void enjoy () {
		System.out.println("And the minion is ... " );
	}
	
	
	public static void generate() {
		System.out.println("Because you like minions you will get a " + minions[b] + " for your collection.");
		b ++;
		
	}
	
	public MinionToy () {
			
	}
	
}
