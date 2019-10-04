package tp2;


/**
 * Classe permettant la representation d'un etudiant
 * @author Virginie Van den Schrieck
 */
public class Etudiant {
	//Variables d'instance
	private String nom;
	private String prenom;
	private int matricule;
	//Cette variable d'instance est du type Date, disponible dans le meme package
	private Date dateNaissance;
	
	/*
	 * Methode main qui cree un etudiant et initialise les variables d'instance au depart de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		etu.setNom(args[0]);
		etu.setPrenom(args[1]);
		etu.setMatricule(Integer.parseInt(args[2]));
		Date dateNaissance = new Date();
		dateNaissance.setJour(Integer.parseInt(args[3]));
		dateNaissance.setMois(Integer.parseInt(args[4]));
		dateNaissance.setAnnee(Integer.parseInt(args[5]));
		System.out.println(etu);
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param matricule
	 * @param dateNaissance
	 */
	public Etudiant(String nom, String prenom, int matricule, Date dateNaissance) {
		super();
		setNom(nom);
		setPrenom(prenom);
		this.matricule = matricule;
		this.dateNaissance = dateNaissance;
	}

	public Etudiant() {
		super();
		setNom("Campos Casares");
		setPrenom("Melvin");
	}
	
	/**
	 * @return the name
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the name to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the firstname
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * @param prenom the firstname to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the matricule
	 */
	public int getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the birthdate
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Permet de changer la date de naissance par une nouvelle date.
	 * La date doit etre posterieur à 1900, sinon le changement n'est pas fait.
	 * @param dateNaissance date dont l'année est plus grande que 1900
	 */
	public void setDateNaissance(Date dateNaissance) {
		if(dateNaissance.getAnnee() > 1900) {
			this.dateNaissance = dateNaissance;
		}
		// else Notification d'erreur
	}

	@Override
	public String toString() {
		return "L'étudiant s'appelle " + prenom  + " " + nom;
	}
}
