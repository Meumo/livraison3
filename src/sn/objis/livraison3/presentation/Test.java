package sn.objis.livraison3.presentation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import sn.objis.livraison3.domaine.Medecin;
import sn.objis.livraison3.domaine.Patient;
import sn.objis.livraison3.domaine.Secretaire;
import sn.objis.livraison3.service.ControleInt;
import sn.objis.livraison3.service.GenerateCode;
import sn.objis.livraison3.service.IServiceMedecinImpl;
import sn.objis.livraison3.service.IServicePatientImpl;
import sn.objis.livraison3.service.IServiceSecretaireImpl;
import sn.objis.livraison3.service.Menu;

/**
 * La classe principale 'Test', point d'entree de l'application
 * permet de tester les differents services de l'application
 * 
 * @author DIOUF Mamadou
 *
 */
public class Test {

	public static void main(String[] args) {
		Menu.menu1();
		Scanner sc = new Scanner(System.in);
		int choix = ControleInt.controleEntier();
		int choix2;
		IServiceMedecinImpl iServiceMedecinImpl = new IServiceMedecinImpl();
		IServicePatientImpl iServicePatientImpl = new IServicePatientImpl();
		IServiceSecretaireImpl iServiceSecretaireImpl = new IServiceSecretaireImpl();
		GenerateCode generateCode = new GenerateCode();
		switch (choix) {

		case 1:
			String rep;
			do {
				Menu.menuMedecin();
				choix2 = ControleInt.controleEntier();
				switch (choix2) {

				case 1:
					Medecin medecin = new Medecin();
					System.out.println("Entrer le nom");
					medecin.setNomMedecin(sc.nextLine());
					System.out.println("Entrer le prenom");
					medecin.setPrenomMedecin(sc.nextLine());
					System.out.println("Entrer le sexe");
					medecin.setSexeMedecin(sc.nextLine());
					medecin.setCodeMedecin(generateCode.generateCodeMedecin());
					iServiceMedecinImpl.ajouter(medecin);
					break;
				case 2:
					System.out.println("Entrer le code du medecin à modifier");
					String code = sc.nextLine();
					Medecin nouveauMedecin = iServiceMedecinImpl.chercherParCode(code);
					if (nouveauMedecin != null) {
						System.out.println("Entrer le nouveau nom");
						nouveauMedecin.setNomMedecin(sc.nextLine());
						System.out.println("Entrer le nouveau prenom");
						nouveauMedecin.setPrenomMedecin(sc.nextLine());
						System.out.println("Entrer le nouveau sexe");
						nouveauMedecin.setSexeMedecin(sc.nextLine());
						iServiceMedecinImpl.modifier(nouveauMedecin);
					} else {
						System.out.println("Cet code n'existe pas");
					}
					break;
				case 3:
					System.out.println("Entrer le code du medecin à supprimer");
					Medecin medecinASupprimer = iServiceMedecinImpl.chercherParCode(sc.nextLine());
					if (medecinASupprimer != null)
						iServiceMedecinImpl.supprimer(medecinASupprimer);
					else
						System.out.println("cet medecin n'existe pas");
					break;
				case 4:
					System.out.println("Entrer le code du medecin à rechercher");
					Medecin medecinARechercher = iServiceMedecinImpl.chercherParCode(sc.nextLine());
					if (medecinARechercher != null)
						System.out.println(medecinARechercher);
					else
						System.out.println("cet medecin n'existe pas");
					break;
				case 5:
					List<Medecin> listMedecin = iServiceMedecinImpl.lire();
					if (listMedecin != null) {
						Stream<Medecin> str = listMedecin.stream();
						str.forEach(System.out::println);
					} else
						System.out.println("La liste des medecins est vide");
					break;
				case 6:
					Test.main(args);
					break;
				default:
					System.out.println("Verifiez votre choix");
					break;
				}
				System.out.println("Voulez-vous rester dans ce menu (o/n)?");
				rep = sc.nextLine();
			} while (rep.equals("o") || rep.equals("O"));
			Test.main(args);
			break;
		case 2:
			String rep1;
			do {
				Menu.menuPatient();
				choix2 = ControleInt.controleEntier();
				switch (choix2) {

				case 1:
					Patient patient = new Patient();
					System.out.println("Entrer le nom");
					patient.setNomPatient(sc.nextLine());
					System.out.println("Entrer le prenom");
					patient.setPrenomPatient(sc.nextLine());
					System.out.println("Entrer le sexe");
					patient.setSexePatient(sc.nextLine());
					System.out.println("Entrer l'age");
					int age = ControleInt.controleEntier();
					patient.setAgePatient(age);
					System.out.println("Entrer l'adresse");
					patient.setAdressePatient(sc.nextLine());
					System.out.println("Entrer l'assurance");
					patient.setAssurancePatient(sc.nextLine());
					patient.setCodePatient(generateCode.generateCodePatient());
					iServicePatientImpl.ajouter(patient);
					break;
				case 2:
					System.out.println("Entrer le code du patient à modifier");
					String code = sc.nextLine();
					Patient nouveauPatient = iServicePatientImpl.chercherParCode(code);
					if (nouveauPatient != null) {
						System.out.println("Entrer le nouveau nom");
						nouveauPatient.setNomPatient(sc.nextLine());
						System.out.println("Entrer le nouveau prenom");
						nouveauPatient.setPrenomPatient(sc.nextLine());
						System.out.println("Entrer le sexe");
						nouveauPatient.setSexePatient(sc.nextLine());
						System.out.println("Entrer l'age");
						int nouvoAge = ControleInt.controleEntier();
						nouveauPatient.setAgePatient(nouvoAge);
						System.out.println("Entrer le nouveau adresse");
						nouveauPatient.setAdressePatient(sc.nextLine());
						System.out.println("Entrer l'assurance");
						nouveauPatient.setAssurancePatient(sc.nextLine());
						iServicePatientImpl.modifier(nouveauPatient);
					} else {
						System.out.println("Le code n'existe pas");
					}
					break;
				case 3:
					System.out.println("Entrer le code du patient à supprimer");
					String codeSup = sc.nextLine();
					Patient patientASupprimer = iServicePatientImpl.chercherParCode(codeSup);
					if (patientASupprimer != null)
						iServicePatientImpl.supprimer(patientASupprimer);
					else
						System.out.println("cet patient n'existe pas");
					break;
				case 4:
					System.out.println("Entrer le code du patient à rechercher");
					String codePat = sc.nextLine();
					Patient patientARechercher = iServicePatientImpl.chercherParCode(codePat);
					if (patientARechercher != null)
						System.out.println(patientARechercher);
					else
						System.out.println("cet patient n'existe pas");
					break;
				case 5:
					List<Patient> listPatient = iServicePatientImpl.lire();
					if (listPatient != null) {
						Stream<Patient> str = listPatient.stream();
						str.forEach(System.out::println);
						System.out.println("");
					} else
						System.out.println("La liste des patients est vide");
					break;
				case 6:
					Test.main(args);
					break;
				default:
					System.out.println("Verifiez votre choix");
					break;
				}
				System.out.println("Voulez-vous rester dans ce menu (o/n)?");
				rep1 = sc.nextLine();
			} while (rep1.equals("o") || rep1.equals("O"));
			Test.main(args);
			break;
		case 3:
			String rep2;
			do {
				Menu.menuSecretaire();
				choix2 = ControleInt.controleEntier();
				switch (choix2) {

				case 1:
					Secretaire secretaire = new Secretaire();
					System.out.println("Entrer le nom");
					secretaire.setNomSecretaire(sc.nextLine());
					System.out.println("Entrer le prenom");
					secretaire.setPrenomSecretaire(sc.nextLine());
					secretaire.setCodeSecretaire(generateCode.generateCodeSecretaire());
					iServiceSecretaireImpl.ajouter(secretaire);
					break;
				case 2:
					System.out.println("Entrer le code sécrétaire à modifier");
					String code = sc.nextLine();
					Secretaire nouvelleSecretaire = iServiceSecretaireImpl.chercherParCode(code);
					if (nouvelleSecretaire != null) {
						System.out.println("Entrer le nouveau nom");
						nouvelleSecretaire.setNomSecretaire(sc.nextLine());
						System.out.println("Entrer le nouveau prenom");
						nouvelleSecretaire.setPrenomSecretaire(sc.nextLine());
						iServiceSecretaireImpl.modifier(nouvelleSecretaire);
					} else {
						System.out.println("Le code n'existe pas");
					}
					break;
				case 3:
					System.out.println("Entrer le code sécrétaire à supprimer");
					String codeSecASup = sc.nextLine();
					Secretaire secretaireASup = iServiceSecretaireImpl.chercherParCode(codeSecASup);
					if (secretaireASup != null)
						iServiceSecretaireImpl.supprimer(secretaireASup);
					else
						System.out.println("cette sécrétaire n'existe pas");
					break;
				case 4:
					System.out.println("Entrer le code sécrétaire à rechercher");
					String codeSecARech = sc.nextLine();
					Secretaire secretaireARech = iServiceSecretaireImpl.chercherParCode(codeSecARech);
					if (secretaireARech != null)
						System.out.println(secretaireARech);
					else
						System.out.println("cette sécrétaire n'existe pas");
					break;
				case 5:
					List<Secretaire> listSecretaire = iServiceSecretaireImpl.lire();
					if (listSecretaire != null) {
						Stream<Secretaire> str = listSecretaire.stream();
						str.forEach(System.out::println);
						System.out.println("");
					} else
						System.out.println("La liste des sécrétaires est vide");
					break;
				case 6:
					Test.main(args);
					break;
				default:
					System.out.println("Verifiez votre choix");
					break;
				}
				System.out.println("Voulez-vous rester dans ce menu (o/n)?");
				rep2 = sc.nextLine();
			} while (rep2.equals("o") || rep2.equals("O"));
			Test.main(args);
			break;
		case 4:
			System.out.println("Voulez-vous vraiment quitter l'application (o/n)?");
			String res = sc.nextLine();
			if (res.equals("o") || res.equals("O")) {
				System.out.println("Aurevoir A Bientôt!!");
				System.exit(0);
			} else
				Test.main(args);
		default:
			System.out.println("Vérifiez votre choix(1/2/3/4)");
			Test.main(args);
			break;
		}
		sc.close();
	}

}
