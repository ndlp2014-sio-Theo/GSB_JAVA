package gsb.modele.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import gsb.modele.Famille;
import gsb.modele.Medicament;


public class MedicamentDao {
	
	/**
	 * @param depot
	 * @return un médicament
	 */
	public static Medicament rechercherUnMedicament(String unDepotLegal){
		Medicament unMedicament=null;
		Famille uneFamille=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from MEDICAMENT where DEPOTLEGAL='"+unDepotLegal+"'");
		try {
			if (reqSelection.next()) {
				uneFamille = FamilleDao.rechercher(reqSelection.getString(6));
				unMedicament = new Medicament(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(3), reqSelection.getString(4), reqSelection.getInt(5), uneFamille);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from MEDICAMENT where DEPOTLEGAL='"+unDepotLegal+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unMedicament;
	}
	
	public static ArrayList<Medicament> rechercherLesMedicaments(){
		
		ArrayList<Medicament> collectionDesMedicaments = new ArrayList<Medicament>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select DEPOTLEGAL from MEDICAMENT");
		
		try{
		while (reqSelection.next()) {
			String unDepotLegal = reqSelection.getString(1);
		    collectionDesMedicaments.add(MedicamentDao.rechercherUnMedicament(unDepotLegal));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesMedecins()");
		}
		return collectionDesMedicaments;
	}
}
