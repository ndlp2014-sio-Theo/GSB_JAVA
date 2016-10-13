package gsb.modele;

import java.util.ArrayList;

public class Visiteur {
	
	protected String matricule;
	protected String nom;
	protected String prenom;
	protected String login;
	protected String mdp;
	protected String adresse;
	protected String telephone;
	protected String DateEntree;
	protected int Prime;
	protected Unite uneUnite;
	ArrayList <Stocker> LesMedicaments;
	
	/**
	 * 
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param mdp
	 * @param adresse
	 * @param telephone
	 * @param dateEntree
	 * @param prime
	 */
	
	public Visiteur(String matricule, String nom, String prenom, String login, String mdp, String adresse,
			String telephone, String dateEntree, int prime, Unite uneUnite) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.adresse = adresse;
		this.telephone = telephone;
		DateEntree = dateEntree;
		Prime = prime;
		this.uneUnite = uneUnite;
		LesMedicaments = new ArrayList<Stocker>();
	}
	
	/**
	 * 
	 * @return Renvoie Matricule
	 */

	public String getMatricule() {
		return matricule;
	}
	/**
	 * 
	 * @param matricule Matricule à définir
	 */

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/**
	 * 
	 * @return Renvoie Nom
	 */

	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * @param nom Nom à définir
	 */

	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * 
	 * @return Renvoie Prenom
	 */

	public String getPrenom() {
		return prenom;
	}
	/**
	 * 
	 * @param prenom Prenom à définir
	 */

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * 
	 * @return Renvoie Login
	 */

	public String getLogin() {
		return login;
	}
	/**
	 * 
	 * @param login Login a définir
	 */

	
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * 
	 * @return Renvoie MDP
	 */

	public String getMdp() {
		return mdp;
	}
	/**
	 * 
	 * @param mdp MDP à définir
	 */

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	/**
	 * 
	 * @return Renvoie Adresse
	 */

	public String getAdresse() {
		return adresse;
	}
	/**
	 * 
	 * @param adresse Adresse à définir
	 */

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * 
	 * @return Renvoie Téléphone
	 */

	public String getTelephone() {
		return telephone;
	}
	/**
	 * 
	 * @param telephone Téléphone à définir
	 */

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 
	 * @return Renvoie DateEntree
	 */

	public String getDateEntree() {
		return DateEntree;
	}
	/**
	 * 
	 * @param dateEntree DateEntree à définir
	 */

	public void setDateEntree(String dateEntree) {
		DateEntree = dateEntree;
	}
	/**
	 * 
	 * @return Renvoie Prime
	 */

	public int getPrime() {
		return Prime;
	}
	/**
	 * 
	 * @param prime Prime à définir
	 */

	public void setPrime(int prime) {
		Prime = prime;
	}

	/**
	 * @return l'unité
	 */
	public Unite getUneUnite() {
		return uneUnite;
	}

	/**
	 * @param uneUnite
	 */
	public void setUneUnite(Unite uneUnite) {
		this.uneUnite = uneUnite;
	}
	
	
	
}
