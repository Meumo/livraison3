package sn.objis.livraison3.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sn.objis.livraison3.domaine.Secretaire;

/**
 * Date Juillet 23-2018 # La classe 'TestIdaoSecreatireImpl' est conçue pour
 * tester les differentes méthodes de la classe 'IdaoSecreatireImpl'
 * 
 * @author DIOUF Mamadou
 *
 */
public class TestIdaoSecretaireImpl {
	Secretaire secretaire = new Secretaire("TEST", "Test", "TESTCODE");

	/**
	 * Declaration d'une variable de type IDaoSecretaireImpl
	 */
	IDaoSecretaireImpl idaoSecretaireImpl;

	/**
	 * cette methode sera executee avant le lancement des tests
	 */
	@Before
	public void init() {
		idaoSecretaireImpl = new IDaoSecretaireImpl();
	}

	@Test
	public void testCreate() {
		idaoSecretaireImpl.create(secretaire);
	}

	@Test
	public void testRead() {
		List<Secretaire> listSecretaire = new ArrayList<>();
		listSecretaire = idaoSecretaireImpl.read();
		Assert.assertNotNull(listSecretaire);
	}

	@Test
	public void testUpdate() {
		idaoSecretaireImpl.update(secretaire);
	}

	@Test
	public void testDelete() {
		idaoSecretaireImpl.delete(secretaire);
	}

	@Test
	public void testFindByCode() {
		Secretaire secretaireTrouve;
		String code = "COSEC1";
		secretaireTrouve = idaoSecretaireImpl.findByCode(code);
		Assert.assertNotNull(secretaireTrouve);
	}

}
