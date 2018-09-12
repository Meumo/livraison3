package sn.objis.livraison3.domaine;

/**
 * Date Juillet 23-2018 # la classe secretaire gere les etats d'une secretaire
 * dans notre application.
 * 
 * @author DIOUF Mamadou
 * @since 2018
 * @version 1.0-SNAPSHOT
 */
public class Secretaire {
	/**
	 * Champ qui stocke l'identifiant d'une secretaire
	 */
	private long idSecretaire;
	/**
	 * Champ qui stocke le nom d'une secretaire
	 */
	private String nomSecretaire;
	/**
	 * Champ qui stocke le prénom d'une secretaire
	 */
	private String prenomSecretaire;
	/**
	 * Champ qui stocke le code d'une secretaire
	 */
	private String codeSecretaire;

	/**
	 * Constructeur sans arguments
	 */
	public Secretaire() {
		super();
	}

	/**
	 * Constructeur avec arguments (long idSecretaire, String nomSecretaire, String
	 * prenomSecretaire, String codeSecretaire)
	 * 
	 * @param idSecretaire
	 *            Parametre qui stocke l'identifiant
	 * @param nomSecretaire
	 *            Parametre qui stocke le nom
	 * @param prenomSecretaire
	 *            Parametre qui stocke le prenom
	 * @param codeSecretaire
	 *            Parametre qui stocke le code
	 */
	public Secretaire(long idSecretaire, String nomSecretaire, String prenomSecretaire, String codeSecretaire) {
		super();
		this.idSecretaire = idSecretaire;
		this.nomSecretaire = nomSecretaire;
		this.prenomSecretaire = prenomSecretaire;
		this.codeSecretaire = codeSecretaire;
	}

	/**
	 * Constructeur avec arguments (String nomSecretaire, String prenomSecretaire,
	 * String codeSecretaire)
	 * 
	 * @param nomSecretaire
	 *            Parametre qui stocke le nom
	 * @param prenomSecretaire
	 *            Parametre qui stocke le prenom
	 * @param codeSecretaire
	 *            Parametre qui stocke le code
	 */
	public Secretaire(String nomSecretaire, String prenomSecretaire, String codeSecretaire) {
		super();
		this.nomSecretaire = nomSecretaire;
		this.prenomSecretaire = prenomSecretaire;
		this.codeSecretaire = codeSecretaire;
	}

	public long getIdSecretaire() {
		return idSecretaire;
	}

	public void setIdSecretaire(long idSecretaire) {
		this.idSecretaire = idSecretaire;
	}

	public String getNomSecretaire() {
		return nomSecretaire;
	}

	public void setNomSecretaire(String nomSecretaire) {
		this.nomSecretaire = nomSecretaire;
	}

	public String getPrenomSecretaire() {
		return prenomSecretaire;
	}

	public void setPrenomSecretaire(String prenomSecretaire) {
		this.prenomSecretaire = prenomSecretaire;
	}

	public String getCodeSecretaire() {
		return codeSecretaire;
	}

	public void setCodeSecretaire(String codeSecretaire) {
		this.codeSecretaire = codeSecretaire;
	}

	@Override
	public String toString() {
		return "\nId Secretaire:" + idSecretaire + "\nNom Secretaire:" + nomSecretaire + "\nPrenom Secretaire:"
				+ prenomSecretaire + "\nCode Secretaire:" + codeSecretaire;
	}

}
