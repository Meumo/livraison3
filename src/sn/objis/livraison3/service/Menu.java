package sn.objis.livraison3.service;

/**
 * Date Juillet 23-2018 # La classe 'Menu' gere le menu general et les sous menu
 * de l'apllication
 * 
 * @author DIOUF Mamadou
 *
 */
public class Menu {

	/**
	 * La methode 'menu1()' static avec type de retour void code le menu general.
	 */
	public static void menu1() {
		System.out.println("------------------------------------------------------------------\n");
		System.out.println("\tBIENVENUE DANS NOTRE APPLICATION GESTION CLINIQUE\n");
		System.out.println("------------------------------------------------------------------\n");
		System.out.println("1.Gestion Medecin");
		System.out.println("2.Gestion Patient");
		System.out.println("3.Gestion Sécrétaire");
		System.out.println("4.Quitter\n");

		System.out.println("Faites votre choix(1/2/3/4)");
	}

	/**
	 * La methode 'menuMedecin()' static avec type de retour void code le menu d'un
	 * medecin.
	 */
	public static void menuMedecin() {
		System.out.println("\t\nGESTION MEDECIN");
		System.out.println("1.Creer un medecin");
		System.out.println("2.Mettre a jour les données d'un medecin");
		System.out.println("3.Supprimer un medecin");
		System.out.println("4.Rechercher un medecin avec son code");
		System.out.println("5.Lister les medecins");
		System.out.println("6.Retour au menu precedent");

		System.out.println("Faites votre choix(1/2/3/4/5/6)");
	}

	/**
	 * La methode 'menuPatient()' static avec type de retour void code le menu d'un
	 * patient.
	 */
	public static void menuPatient() {
		System.out.println("\t\nGESTION PATIENT");
		System.out.println("1.Créer un patient");
		System.out.println("2.Mettre à jour les données d'un patient");
		System.out.println("3.Supprimer un patient");
		System.out.println("4.Rechercher un patient avec son code");
		System.out.println("5.Lister les patients");
		System.out.println("6.Retour au menu precedent");

		System.out.println("Faites votre choix(1/2/3/4/5/6)");
	}

	/**
	 * La methode 'menuSecreatire()' static avec type de retour void code le menu
	 * d'une secretaire.
	 */
	public static void menuSecretaire() {
		System.out.println("\t\nGESTION SECRETAIRE");
		System.out.println("1.Creer une Sécrétaire");
		System.out.println("2.Mettre a jour les données d'une sécrétaire");
		System.out.println("3.Supprimer une sécrétaire");
		System.out.println("4.Rechercher une sécrétaire avec son code");
		System.out.println("5.Lister les sécrétaires");
		System.out.println("6.Retour au menu precedent");

		System.out.println("Faites votre choix(1/2/3/4/5/6)");
	}
}
