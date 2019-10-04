/**
 * 
 */
package tp2;



/**
 * Cette classe modelise une date de maniere simplifiee.
 * @author Virginie Van den Schrieck
 *
 */
public class Date {
	
	//variables d'instance
	private int jour;
	private int mois;
	private int annee;
	
	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		if(jour <= 31 || jour >= 1) {
			this.jour = jour;
		}
	}

	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		if(mois <= 12 || mois >= 1) {
			this.mois = mois;
		}
	}

	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		if(annee > 1900) {
			this.annee = annee;
		}
	}

	/**
	 * La methode main permet de tester la classe date en creant un objet 
	 * au depart des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'annee.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date();
		d.jour = Integer.parseInt(args[0]);
		d.mois = Integer.parseInt(args[1]);
		d.annee = Integer.parseInt(args[2]);
	}
	
	
}
