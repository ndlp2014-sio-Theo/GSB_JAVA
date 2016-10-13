package gsb.modele;
import gsb.modele.Medicament;

public class Offrir {

	protected int qteOfferte;
	protected Medicament unMedicament;
	protected Visite uneVisite;
	
	/**
	 * @param qteOfferte
	 * @param unMedicament
	 */
	public Offrir(int qteOfferte, Medicament unMedicament, Visite uneVisite) {
		this.qteOfferte = qteOfferte;
		this.unMedicament = unMedicament;
		this.uneVisite = uneVisite;
	}

	/**
	 * @return la quantité offerte
	 */
	public int getQteOfferte() {
		return qteOfferte;
	}

	/**
	 * @param qteOfferte
	 */
	public void setQteOfferte(int qteOfferte) {
		this.qteOfferte = qteOfferte;
	}

	/**
	 * @return le médicament offert
	 */
	public Medicament getUnMedicament() {
		return unMedicament;
	}

	/**
	 * @param unMedicament
	 */
	public void setUnMedicament(Medicament unMedicament) {
		this.unMedicament = unMedicament;
	}

	public Visite getUneVisite() {
		return uneVisite;
	}

	public void setUneVisite(Visite uneVisite) {
		this.uneVisite = uneVisite;
	}
		
}