package gsb.modele;
import gsb.modele.Medicament;

public class Stocker {
	
	protected int qteStock;
	protected Medicament unMedicament;
	
	public Stocker(int qteStock, Medicament unMedicament) {
		this.qteStock = qteStock;
		this.unMedicament = unMedicament;
	}
	
	/**
	 * @return
	 */
	public int getQteStock() {
		return qteStock;
	}
	
	/**
	 * @param qteStock
	 */
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	
	/**
	 * @return
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
	
	
	
}
