package personnages;

public class Gaulois {
	private String nom ;
	private int force ;
	private int effetPotion = 1 ;
	
	public Gaulois(String nom, int force) {
		
		this.nom = nom;
		this.force = force;
	}

	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		romain.recevoirCoup((force / 3)*this.effetPotion);
	}
	
	public void boirePotion(int effetPotion){
		this.effetPotion=effetPotion;
		parler("  Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
			
	}

	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix  = new Gaulois("Asterix",8);
		System.out.println(asterix);
		
		//test de boirePotion
		asterix.boirePotion(2);
		System.out.println(asterix);
		
		
	}


}
