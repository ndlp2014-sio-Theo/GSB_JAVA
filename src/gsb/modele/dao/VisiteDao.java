package gsb.modele.dao;
import java.sql.ResultSet;

import gsb.modele.Medecin;
import gsb.modele.Visite;
import gsb.modele.Visiteur;

public class VisiteDao {
	
	public static Visite rechercher(String Ref){
		Visite uneVisite=null;
		Visiteur unVisiteur=null;
		Medecin unMedecin=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITE where REFERENCE='"+Ref+"'");
		try {
			if (reqSelection.next()) {
				unVisiteur = VisiteurDao.rechercher(reqSelection.getString(3));
				unMedecin = MedecinDao.rechercher(reqSelection.getString(4));
				uneVisite = new Visite(reqSelection.getString(1),reqSelection.getString(2), unVisiteur, unMedecin);	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITE where REFERENCE='"+Ref+"'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
	}
}
