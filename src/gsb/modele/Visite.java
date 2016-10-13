package gsb.modele;
import java.util.ArrayList;

import gsb.modele.Offrir;

public class Visite {
	protected String reference;
	protected String date;
	protected Visiteur unVisiteur;
	protected Medecin unMedecin;
	ArrayList <Offrir> LesMedicaments;

	
	/**
	 * @param reference
	 * @param date
	 * @param lesMedicaments
	 */
	public Visite(String reference, String date, Visiteur unVisiteur, Medecin unMedecin) {
		this.reference = reference;
		this.date = date;
		this.unVisiteur = unVisiteur;
		this.unMedecin = unMedecin;
		LesMedicaments = new ArrayList<Offrir>();
	}

	/**
	 * 
	 * @return Renvoie Reference.
	 */

	public String getReference() {
		return reference;
	}
	
	/**
	 * 
	 * @param reference Reference à définir.
	 */

	public void setReference(String reference) {
		this.reference = reference;
	}
	/**
	 * 
	 * @return Renvoie Date.
 	 */

	public String getDate() {
		return date;
	}
	
	/**
	 * 
	 * @param date Date à définir.
	 */

	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return le visiteur
	 */
	public Visiteur getUnVisiteur() {
		return unVisiteur;
	}

	/**
	 * @param unVisiteur
	 */
	public void setUnVisiteur(Visiteur unVisiteur) {
		this.unVisiteur = unVisiteur;
	}

	/**
	 * @return le médecin
	 */
	public Medecin getUnMedecin() {
		return unMedecin;
	}

	/**
	 * @param unMedecin
	 */
	public void setUnMedecin(Medecin unMedecin) {
		this.unMedecin = unMedecin;
	}
	
	

}
