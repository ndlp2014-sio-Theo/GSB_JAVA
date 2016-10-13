package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Unite;
import gsb.modele.Visiteur;

public class VisiteurDao {
	
	/**
	 * 
	 * @param Matricule
	 * @return Matricule Visiteur
	 */
	

	public static Visiteur rechercher(String Matricule){
		Visiteur unVisiteur=null;
		Unite uneUnite=null;
		
		
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE='"+Matricule+"'");
		try {
			if (reqSelection.next()) {
				uneUnite=UniteDao.rechercher(reqSelection.getString(10));
				unVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2),reqSelection.getString(3),
						reqSelection.getString(4),reqSelection.getString(5), reqSelection.getString(6),
						reqSelection.getString(7), reqSelection.getString(8),reqSelection.getInt(9),uneUnite);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITEUR where MATRICULE='"+Matricule+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
	}
	
	/**
	 * 
	 * @return collection des Visiteurs
	 */
	
	public static ArrayList<Visiteur> retournerCollectionDesVisiteurs(){
		ArrayList<Visiteur> collectionDesVisiteurs = new ArrayList<Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from VISITEUR");
		try{
		while (reqSelection.next()) {
			String Matricule = reqSelection.getString(1);
		    collectionDesVisiteurs.add(VisiteurDao.rechercher(Matricule));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesMedecins()");
		}
		return collectionDesVisiteurs;
	}
	
	/**
	 * 
	 * @return dico Visiteurs
	 */
	
	public static HashMap<String,Visiteur> retournerDictionnaireDesVisiteurs(){
		HashMap<String, Visiteur> diccoDesVisiteurs = new HashMap<String, Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEMED from MEDECIN");
		try{
		while (reqSelection.next()) {
			String Matricule = reqSelection.getString(1);
		    diccoDesVisiteurs.put(Matricule, VisiteurDao.rechercher(Matricule));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesMedecins()");
		}
		return diccoDesVisiteurs;
	}	
	

}
 

