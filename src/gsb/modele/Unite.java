package gsb.modele;

public class Unite {
	protected String codeUnit;
	protected String nom;
	
	/**
	 * 
	 * @param codeUnit
	 * @param nom
	 */
	public Unite(String codeUnit, String nom){
		this.codeUnit = codeUnit;
		this.nom = nom;
	}
	/**
	 * 
	 * @return Renvoie codeUnit.
	 */

	public String getCodeUnit() {
		return codeUnit;
	}
	/**
	 * 
	 * @param codeUnit codeUnit � d�finir.
	 */

	public void setCodeUnit(String codeUnit) {
		this.codeUnit = codeUnit;
	}
	
	/**
	 * 
	 * @return Renvoie Nom.
	 */


	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * @param nom nom � d�finir.
	 */


	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
