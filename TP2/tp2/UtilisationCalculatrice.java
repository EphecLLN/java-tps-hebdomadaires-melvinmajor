package tp2;

public class UtilisationCalculatrice {
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
		System.out.println(myNewCalc.getValeurCourante());
		
		myNewCalc.ajoute(5);
		myNewCalc.soustrait(3);
		System.out.println(myNewCalc.getValeurCourante());
	}
}
