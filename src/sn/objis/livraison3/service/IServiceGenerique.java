package sn.objis.livraison3.service;

import java.util.List;

/**
 * Date Juillet 23-2018 # L'interface IServiceGenerique c'est une interface
 * generique qui contient nos methodes generique.
 * 
 * @author DIOUF Mamadou
 *
 * @param <X>
 *            Paramétre de type générique
 */
public interface IServiceGenerique<X> {
	/**
	 * La methode 'ajouter(X x)' generique a pour but de recevoir un objet et de
	 * l'ajouer dans une base de donnees relationnelle.
	 * 
	 * @param x
	 *            Parametre de type generique
	 */
	public void ajouter(X x);

	/**
	 * La methode 'lire()' generique a pour but lire des donnees dans une base de
	 * donnees relationnelle, creer une liste et l'ajouter dans cette derniere.
	 * 
	 * @return List (retourne une liste d'objet)
	 */
	public List<X> lire();

	/**
	 * La methode 'modifier()' generique a pour but de mettre à jour les donnees
	 * d'une ligne precise dans une base de donnees relationnelle.
	 * 
	 * @param x
	 *            Paramétre de type générique
	 */
	public void modifier(X x);

	/**
	 * La methode 'supprimer(X x)' generique a pour but de supprimer les donnees
	 * d'une ligne précise dans une base de donnees relationnelle.
	 * 
	 * @param x
	 *            Parametre de type generique
	 */
	public void supprimer(X x);

	/**
	 * La methode 'chercherParCode(String code)' generique a pour but de rechercher
	 * les donnees dans une base de donnees relationnelle.
	 * 
	 * @param code
	 *            Parametre que reçoit notre methode 'findByCode'
	 * @return X (type generique) Retourne l'objet trouve
	 */
	public X chercherParCode(String code);
}
