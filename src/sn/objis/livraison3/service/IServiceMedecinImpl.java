package sn.objis.livraison3.service;

import java.util.List;

import sn.objis.livraison3.dao.IDaoMedecinImpl;
import sn.objis.livraison3.domaine.Medecin;

/**
 * Date Juillet 23-2018 # La classe 'IServiceMedecinImpl' fourni une
 * implementation de notre interface 'IServiceMedecin' qui etend l'interface
 * 'IServiceGenerique'.
 * 
 * @author DIOUF Mamadou
 * @see IServiceMedecin
 */
public class IServiceMedecinImpl implements IServiceMedecin {

	/**
	 * Instanciation d'un objet de type IDaoMedecinImpl
	 */
	IDaoMedecinImpl idaoMedecin = new IDaoMedecinImpl();

	@Override
	public void ajouter(Medecin x) {
		idaoMedecin.create(x);
	}

	@Override
	public List<Medecin> lire() {
		return idaoMedecin.read();
	}

	@Override
	public void modifier(Medecin x) {
		idaoMedecin.update(x);
	}

	@Override
	public void supprimer(Medecin x) {
		idaoMedecin.delete(x);
	}

	@Override
	public Medecin chercherParCode(String code) {
		return idaoMedecin.findByCode(code);
	}

}
