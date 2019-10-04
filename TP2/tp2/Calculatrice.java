package tp2;

/**
 * Cette classe modelise une calculatrice simplifiee avec une valeur courante et trois operations. 
 * @author vvandens
 *
 */
public class Calculatrice {

	private double valeurCourante; // Stocke la valeur affichee sur l'ecran de la calculatrice
	
	//Constructeurs
	/**
	 * @param valeurCourante
	 */
	public Calculatrice(double valeurCourante) {
		super();
		this.valeurCourante = valeurCourante;
	}
	/**
	 * 
	 */
	public Calculatrice() {
		this.valeurCourante = 10;
	}	



	//Getters and setters
	
	/**
	 * @return la valeurCourante actuellement affichee sur la calculatrice
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}
	/**
	 * @param valeurCourante la nouvelle valeur a afficher sur la calculatrice
	 */
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	
	
	
	
	
	//Methodes
	
	/**
	 * Additionne un nombre a la valeur courante
	 * @param n le nombre a ajouter a la valeur courante de la calculatrice
	 */
	public void ajoute(double n) {
		valeurCourante+=n;
	}
	/**
	 * Soustrait un nombre a la valeur courante
	 * @param n le nombre a soustraire a la valeur courante de la calculatrice
	 */
	public void soustrait(double n) {
		valeurCourante-=n;
	}
	/**
	 * Eleve la valeur courante au carre
	 */
	public void carre() {
		valeurCourante*=valeurCourante;
	}
	
	
	/**
	 * Renvoie une representation textuelle de la valeur affichee sur la calculatrice
	 */
	public String toString() {
		return "La calculatrice affiche la valeur " + getValeurCourante();
	}
	
	/**
	 * Methode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice myCalc;
		
		if(args.length==0) {
			myCalc = new Calculatrice();
		}
		else {
			myCalc = new Calculatrice(Double.parseDouble(args[0]));
		}
		System.out.println(myCalc);
		
		
		Calculatrice myNewCalc = new Calculatrice(125);
		System.out.println(myNewCalc.valeurCourante);
		
		myNewCalc.ajoute(5);
		myNewCalc.soustrait(2);
		System.out.println(myNewCalc.valeurCourante);
	}

}
