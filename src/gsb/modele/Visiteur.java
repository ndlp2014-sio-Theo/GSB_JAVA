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
	 * @param matricule Matricule � d�finir
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
	 * @param nom Nom � d�finir
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
	 * @param prenom Prenom � d�finir
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
	 * @param login Login a d�finir
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
	 * @param mdp MDP � d�finir
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
	 * @param adresse Adresse � d�finir
	 */

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * 
	 * @return Renvoie T�l�phone
	 */

	public String getTelephone() {
		return telephone;
	}
	/**
	 * 
	 * @param telephone T�l�phone � d�finir
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
	 * @param dateEntree DateEntree � d�finir
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
	 * @param prime Prime � d�finir
	 */

	public void setPrime(int prime) {
		Prime = prime;
	}

	/**
	 * @return l'unit�
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
