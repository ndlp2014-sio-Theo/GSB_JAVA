package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Medicament;
import gsb.modele.Offrir;


public class OffrirDao {

		
		public static Offrir rechercher(String unDepotLegal){
			
			Offrir uneOffre=null;
			Medicament unMedicament=null;
			ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from OFFRIR where DEPOTLEGAL='"+unDepotLegal+"'");
			try {
				if (reqSelection.next()) {
					unMedicament=MedicamentDao.rechercherUnMedicament(reqSelection.getString(2));
					uneOffre = new Offrir(reqSelection.getInt(1),unMedicament);	
				};
				}
			catch(Exception e) {
				System.out.println("erreur reqSelection.next() pour la requête - select * from STOCKER where DEPOTLEGAL='"+unDepotLegal+"'");
				e.printStackTrace();
				}
			ConnexionMySql.fermerConnexionBd();
			return uneOffre;
		}
		
		public static void ajouterOffre(Offrir uneOffre){
			
			ResultSet reqSelection = ConnexionMySql.execReqSelection("INSERT INTO OFFRIR VALUES ("+uneOffre.getUnMedicament().getDepotLegal()+","+uneOffre.+","+uneOffre.getQteOfferte()+")");
			try {
				if (reqSelection.next()) {
					unMedicament=MedicamentDao.rechercherUnMedicament(reqSelection.getString(2));
					uneOffre = new Offrir(reqSelection.getInt(1),unMedicament);	
				};
				}
			catch(Exception e) {
				System.out.println("erreur reqSelection.next() pour la requête - select * from STOCKER where DEPOTLEGAL='"+unDepotLegal+"'");
				e.printStackTrace();
				}
			ConnexionMySql.fermerConnexionBd();
			

		}
	}
