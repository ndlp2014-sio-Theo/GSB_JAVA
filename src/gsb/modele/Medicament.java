package gsb.modele;

public class Medicament {
	
	protected String depotLegal;
	protected String nomCommercial;
	protected String composition;
	protected String effet;
	protected String contreIndication;
	protected int prixEchantillon;
	protected Famille uneFamille;
	
	/**
	 * 
	 * @param depotLegal
	 * @param nomCommercial
	 * @param composition
	 * @param effet
	 * @param contreIndication
	 * @param prixEchantillon
	 */
	public Medicament(String depotLegal, String nomCommercial, String composition, String effet,
			String contreIndication, int prixEchantillon, Famille uneFamille) {
		this.depotLegal = depotLegal;
		this.nomCommercial = nomCommercial;
		this.composition = composition;
		this.effet = effet;
		this.contreIndication = contreIndication;
		this.prixEchantillon = prixEchantillon;
		this.uneFamille = uneFamille;
	}
	
	/**
	 * 
	 * @return Renvoie DepotLegal
	 */

	public String getDepotLegal() {
		return depotLegal;
	}
	
	/**
	 * 
	 * @param depotLegal DepotLegal à définir
	 */

	public void setDepotLegal(String depotLegal) {
		this.depotLegal = depotLegal;
	}
	
	/**
	 * 
	 * @return Renvoie NomCommercial
	 */

	public String getNomCommercial() {
		return nomCommercial;
	}
	
	/**
	 * 
	 * @param nomCommercial nomCommercial à définir
	 */

	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}
	/**
	 * 
	 * @return Renvoie Composition
	 */

	public String getComposition() {
		return composition;
	}
	/**
	 * 
	 * @param composition Composition à définir
	 */

	public void setComposition(String composition) {
		this.composition = composition;
	}
	
	/**
	 * 
	 * @return Renvoie Effet
	 */

	public String getEffet() {
		return effet;
	}
	/**
	 * 
	 * @param effet Effet à définir
	 */

	public void setEffet(String effet) {
		this.effet = effet;
	}
	/**
	 * 
	 * @return Renvoie contreIndication
	 */

	public String getContreIndication() {
		return contreIndication;
	}
	/**
	 * 
	 * @param contreIndication ContreIndication à définir
	 */

	public void setContreIndication(String contreIndication) {
		this.contreIndication = contreIndication;
	}
	/**
	 * 
	 * @return Renvoie PrixEchantillon
	 */

	public int getPrixEchantillon() {
		return prixEchantillon;
	}
	/**
	 * 
	 * @param prixEchantillon PrixEchantillon à définir
	 */

	public void setPrixEchantillon(int prixEchantillon) {
		this.prixEchantillon = prixEchantillon;
	}

	/**
	 * @return la famille
	 */
	public Famille getUneFamille() {
		return uneFamille;
	}

	/**
	 * @param uneFamille
	 */
	public void setUneFamille(Famille uneFamille) {
		this.uneFamille = uneFamille;
	}
	
	
	
	
	
	
	

}
