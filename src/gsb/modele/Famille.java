package gsb.modele;

public class Famille {
	
	protected String codeFamille;
	protected String libelleFamille;
	
	/**
	 * 
	 * @param codeFamille
	 * @param libelleFamille
	 */
	
	public Famille(String codeFamille, String libelleFamille) {
		this.codeFamille = codeFamille;
		this.libelleFamille = libelleFamille;
	}
	
	/**
	 * 
	 * @return Renvoie CodeFamille
	 */

	public String getCodeFamille() {
		return codeFamille;
	}
	/**
	 * 
	 * @param codeFamille CodeFamille à définir
	 */

	public void setCodeFamille(String codeFamille) {
		this.codeFamille = codeFamille;
	}
	/**
	 * 
	 * @return Renvoie LibelleFamille
	 */

	public String getLibelleFamille() {
		return libelleFamille;
	}
	/**
	 * 
	 * @param libelleFamille LibelleFamille à définir
	 */

	public void setLibelleFamille(String libelleFamille) {
		this.libelleFamille = libelleFamille;
	}
	
	
	
	

	
	
	

}
