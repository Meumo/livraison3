package sn.objis.livraison3.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sn.objis.livraison3.domaine.Medecin;

/**
 * Date Juillet 23-2018 # La classe 'TestIdaoMedecinImpl' est conçue pour tester
 * les differentes methodes de la classe 'IdaoMedecinImpl'
 * 
 * @author DIOUF Mamadou
 *
 */
public class TestIdaoMedecinImpl {
	Medecin medecin = new Medecin("TEST", "Test", "F", "CODETEST");

	/**
	 * Declaration d'une variable de type IDaoMedecinImpl
	 */
	IDaoMedecinImpl idaoMedecinImpl;

	/**
	 * cette methode sera executee avant le lancement des tests
	 */
	@Before
	public void init() {
		idaoMedecinImpl = new IDaoMedecinImpl();
	}

	@Test
	public void testCreate() {

		idaoMedecinImpl.create(medecin);
	}

	@Test
	public void testRead() {
		List<Medecin> listMedecin = new ArrayList<>();
		listMedecin = idaoMedecinImpl.read();
		Assert.assertNotNull(listMedecin);
	}

	@Test
	public void testUpdate() {
		idaoMedecinImpl.update(medecin);
	}

	@Test
	public void testDelete() {
		idaoMedecinImpl.delete(medecin);
	}

	@Test
	public void testFindByCode() {
		Medecin medecinTrouve;
		String code = "COMED0";
		medecinTrouve = idaoMedecinImpl.findByCode(code);
		Assert.assertNotNull(medecinTrouve);
	}

}
