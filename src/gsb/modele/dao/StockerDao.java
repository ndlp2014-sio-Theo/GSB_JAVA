package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Medicament;
import gsb.modele.Stocker;



public class StockerDao {
	
	public static Stocker rechercher(String unDepotLegal){
		Stocker unStock=null;
		Medicament unMedicament=null;
		
		
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from STOCKER where DEPOTLEGAL='"+unDepotLegal+"'");
		try {
			if (reqSelection.next()) {
				unMedicament=MedicamentDao.rechercherUnMedicament(reqSelection.getString(2));
				unStock = new Stocker(reqSelection.getInt(1),unMedicament);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from STOCKER where DEPOTLEGAL='"+unDepotLegal+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unStock;

	}
}
