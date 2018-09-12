package sn.objis.livraison3.service;

import java.util.List;

import sn.objis.livraison3.dao.IDaoSecretaireImpl;
import sn.objis.livraison3.domaine.Secretaire;

/**
 * Date Juillet 23-2018 # La classe 'IServiceSecretaireImpl' fourni une
 * implementation de notre interface 'IServiceSecretaire' qui etend l'interface
 * 'IServiceGenerique'.
 * 
 * @author DIOUF Mamadou
 * @see IServiceSecretaire
 */
public class IServiceSecretaireImpl implements IServiceSecretaire {

	/**
	 * Instanciation d'un objet de type IDaoSecretaireImpl
	 */
	IDaoSecretaireImpl idaoSecretaire = new IDaoSecretaireImpl();

	@Override
	public void ajouter(Secretaire x) {
		idaoSecretaire.create(x);
	}

	@Override
	public List<Secretaire> lire() {
		return idaoSecretaire.read();
	}

	@Override
	public void modifier(Secretaire x) {
		idaoSecretaire.update(x);
	}

	@Override
	public void supprimer(Secretaire x) {
		idaoSecretaire.delete(x);
	}

	@Override
	public Secretaire chercherParCode(String code) {
		return idaoSecretaire.findByCode(code);
	}

}
