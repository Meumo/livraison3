package sn.objis.livraison3.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sn.objis.livraison3.domaine.Patient;

/**
 * Date Juillet 23-2018 # La classe 'TestIdaoPatientImpl' est conçue pour tester
 * les differentes methodes de la classe 'IdaoPatientImpl'
 * 
 * @author DIOUF Mamadou
 *
 */
public class TestIdaoPatientImpl {
	Patient patient = new Patient("TEST", "Test", "F", 10, "TEST", "TEST", "TESTCODE");

	/**
	 * Declaration d'une variable de type IDaoPatientImpl
	 */
	IDaoPatientImpl idaoPatientImpl;

	/**
	 * cette methode sera executee avant le lancement des tests
	 */
	@Before
	public void init() {
		idaoPatientImpl = new IDaoPatientImpl();
	}

	@Test
	public void testCreate() {
		idaoPatientImpl.create(patient);
	}

	@Test
	public void testRead() {
		List<Patient> listPatient = new ArrayList<>();
		listPatient = idaoPatientImpl.read();
		Assert.assertNotNull(listPatient);
	}

	@Test
	public void testUpdate() {
		idaoPatientImpl.update(patient);
	}

	@Test
	public void testDelete() {
		idaoPatientImpl.delete(patient);
	}

	@Test
	public void testFindByCode() {
		Patient patientTrouve;
		String code = "COPAT0";
		patientTrouve = idaoPatientImpl.findByCode(code);
		Assert.assertNotNull(patientTrouve);
	}

}
