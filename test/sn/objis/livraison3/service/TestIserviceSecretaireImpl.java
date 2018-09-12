package sn.objis.livraison3.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sn.objis.livraison3.domaine.Secretaire;

/**
 * Date Juillet 23-2018 # La classe 'TestIserviceSecretaireImpl' est conçue pour
 * tester les differentes méthodes de la classe 'IServiceSecretaireImpl'
 * 
 * @author DIOUF Mamadou
 *
 */
public class TestIserviceSecretaireImpl {
	Secretaire secretaire = new Secretaire("TEST", "Test", "TESTCODE");

	/**
	 * Declaration d'une variable de type IServiceSecretaireImpl
	 */
	IServiceSecretaireImpl iServiceSecretaireImpl;

	/**
	 * cette methode sera executée avant le lancement des tests
	 */
	@Before
	public void init() {
		iServiceSecretaireImpl = new IServiceSecretaireImpl();
	}

	@Test
	public void testAjouter() {
		iServiceSecretaireImpl.ajouter(secretaire);
	}

	@Test
	public void testLire() {
		List<Secretaire> listSecretaire = new ArrayList<>();
		listSecretaire = iServiceSecretaireImpl.lire();
		Assert.assertNotNull(listSecretaire);
	}

	@Test
	public void testModifier() {
		iServiceSecretaireImpl.modifier(secretaire);
	}

	@Test
	public void testSupprimer() {
		iServiceSecretaireImpl.supprimer(secretaire);
	}

	@Test
	public void testChercherParCode() {
		Secretaire secretaireTrouve;
		String code = "COSEC1";
		secretaireTrouve = iServiceSecretaireImpl.chercherParCode(code);
		Assert.assertNotNull(secretaireTrouve);
	}

}
