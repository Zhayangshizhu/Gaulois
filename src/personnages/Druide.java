package personnages;

import java.util.Random;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

import zhayang.Gaulois;

public class Druide {
	private String nom;
	private int effetPotionMin ; 
	private int effetPotionMax ;
	private int effetPotion = 1 ;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " ¨¤ "+ effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	public int getEffetPotion() {
		return effetPotion;
		
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	 
	 
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	public void preparePotion() {
		parler(" Je vais aller pr¨¦parer une petite potion...");
		Random random=new Random();
		this.effetPotion=random.nextInt(effetPotionMax-effetPotionMin+1)+effetPotionMin;
		if (effetPotion>7) {
			parler("J'ai pr¨¦par¨¦ une super potion de force " + effetPotion);
			
		}
		else {
			parler("Je n'ai pas trouv¨¦ tous les ingr¨¦dients, ma potion est seulement de force " +effetPotion );
			
		}
	}
	
	public void booster(Gaulois gaulois){
		if (gaulois.getNom()=="Ob¨¦lix") {
			parler("  Non, Ob¨¦lix !... Tu n¡¯auras pas de potion magique ! ");
			gaulois.parler("Par B¨¦l¨¦nos, ce n'est pas juste !");
		}
		
		else {
			
			gaulois.boirePotion(effetPotion);
		}
}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Druide panoramix = new Druide("Panoramix", 5, 10);
		for (int i = 0; i < 10; i++) {
			panoramix.preparePotion();
			
		}
	}

}
