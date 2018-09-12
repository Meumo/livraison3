package sn.objis.livraison3.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sn.objis.livraison3.domaine.Patient;

/**
 * Date Juillet 23-2018 # La classe 'TestIservicePatientImpl' est conçue pour
 * tester les differentes methodes de la classe 'IServicePatientImpl'
 * 
 * @author DIOUF Mamadou
 *
 */
public class TestIservicePatientImpl {
	Patient patient = new Patient("TEST", "Test", "F", 10, "TEST", "TEST", "TESTCODE");

	/**
	 * Declaration d'une variable de type IServicePatientImpl
	 */
	IServicePatientImpl iservicePatientImpl;

	/**
	 * cette methode sera executee avant le lancement des tests
	 */
	@Before
	public void init() {
		iservicePatientImpl = new IServicePatientImpl();
	}

	@Test
	public void testAjouter() {
		iservicePatientImpl.ajouter(patient);
	}

	@Test
	public void testLire() {
		List<Patient> listPatient = new ArrayList<>();
		listPatient = iservicePatientImpl.lire();
		Assert.assertNotNull(listPatient);
	}

	@Test
	public void testModifier() {
		iservicePatientImpl.modifier(patient);
	}

	@Test
	public void testSupprimer() {
		iservicePatientImpl.supprimer(patient);
	}

	@Test
	public void testChercherParCode() {
		Patient patientTrouve;
		String code = "COPAT0";
		patientTrouve = iservicePatientImpl.chercherParCode(code);
		Assert.assertNotNull(patientTrouve);
	}

}
