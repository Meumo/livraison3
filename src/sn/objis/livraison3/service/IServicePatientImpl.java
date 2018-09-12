package sn.objis.livraison3.service;

import java.util.List;

import sn.objis.livraison3.dao.IDaoPatientImpl;
import sn.objis.livraison3.domaine.Patient;

/**
 * Date Juillet 23-2018 # La classe 'IServicePatientImpl' fourni une
 * implementation de notre interface 'IServiceMedecin' qui etend l'interface
 * 'IServiceGenerique'.
 * 
 * @author DIOUF Mamadou
 * @see IServicePatient
 */
public class IServicePatientImpl implements IServicePatient {

	/**
	 * Instanciation d'un objet de type IDaoPatientImpl
	 */
	IDaoPatientImpl idaoPatient = new IDaoPatientImpl();

	@Override
	public void ajouter(Patient x) {
		idaoPatient.create(x);
	}

	@Override
	public List<Patient> lire() {
		return idaoPatient.read();
	}

	@Override
	public void modifier(Patient x) {
		idaoPatient.update(x);
	}

	@Override
	public void supprimer(Patient x) {
		idaoPatient.delete(x);
	}

	@Override
	public Patient chercherParCode(String code) {
		return idaoPatient.findByCode(code);
	}

}
