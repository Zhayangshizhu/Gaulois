package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix  = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Ob¨¦lix",10 );
		Romain  minus = new Romain("Minus",6 );
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		panoramix.preparePotion();
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
		
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU .. UN GAUGAU");
		
		
		
		while (minus.getForce()>0) {
			asterix.frapper(minus);
		}
		
	}

}
