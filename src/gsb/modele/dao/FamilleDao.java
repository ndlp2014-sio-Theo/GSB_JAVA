package gsb.modele.dao;
import java.sql.ResultSet;

import gsb.modele.Famille;

public class FamilleDao {
	
	/**
	 * @param codeFam
	 * @return une famille
	 */
	public static Famille rechercher(String codeFam){
		Famille uneFamille=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from FAMILLE where CODEFAMILLE='"+codeFam+"'");
		try {
			if (reqSelection.next()) {
				uneFamille = new Famille(reqSelection.getString(1), reqSelection.getString(2));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from FAMILLE where CODEFAMILLE='"+codeFam+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneFamille;
	}
}
