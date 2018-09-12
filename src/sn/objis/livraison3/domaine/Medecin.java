package sn.objis.livraison3.domaine;

/**
 * Date Juillet 23-2018 # la classe medecin gere les etats d'un medecin dans
 * notre application.
 * 
 * @author DIOUF Mamadou
 * @since 2018
 * @version 1.0-SNAPSHOT
 */
public class Medecin {
	/**
	 * Champ qui stocke l'identifiant d'un medecin
	 */
	private long idMedecin;
	/**
	 * Champ qui stocke le nom d'un medecin
	 */
	private String nomMedecin;
	/**
	 * Champ qui stocke le prenom d'un medecin
	 */
	private String prenomMedecin;
	/**
	 * Champ qui stocke le sexe d'un medecin
	 */
	private String sexeMedecin;
	/**
	 * Champ qui stocke le code d'un medecin
	 */
	private String codeMedecin;

	/**
	 * constructeurs sans arguments
	 */
	public Medecin() {
		super();
	}

	/**
	 * Constructeur avec arguments (long idMedecin, String nomMedecin, String
	 * prenomMedecin, String sexeMedecin, String codeMedecin)
	 * 
	 * @param idMedecin
	 *            Parametre qui stocke l'identifiant
	 * @param nomMedecin
	 *            Parametre qui stocke le nom
	 * @param prenomMedecin
	 *            Parametre qui stocke le prenom
	 * @param sexeMedecin
	 *            Parametre qui stocke le sexe
	 * @param codeMedecin
	 *            Parametre qui stocke le code
	 */
	public Medecin(long idMedecin, String nomMedecin, String prenomMedecin, String sexeMedecin, String codeMedecin) {
		super();
		this.idMedecin = idMedecin;
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.sexeMedecin = sexeMedecin;
		this.codeMedecin = codeMedecin;
	}

	/**
	 * Constructeur avec arguments (String nomMedecin, String prenomMedecin, String
	 * sexeMedecin, String codeMedecin
	 * 
	 * @param nomMedecin
	 *            Parametre qui stocke le nom
	 * @param prenomMedecin
	 *            Parametre qui stocke le prenom
	 * @param sexeMedecin
	 *            Parametre qui stocke le sexe
	 * 
	 * @param codeMedecin
	 *            Parametre qui stocke le code
	 */
	public Medecin(String nomMedecin, String prenomMedecin, String sexeMedecin, String codeMedecin) {
		super();
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.sexeMedecin = sexeMedecin;
		this.codeMedecin = codeMedecin;
	}

	public long getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(long idMedecin) {
		this.idMedecin = idMedecin;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	public String getPrenomMedecin() {
		return prenomMedecin;
	}

	public void setPrenomMedecin(String prenomMedecin) {
		this.prenomMedecin = prenomMedecin;
	}

	public String getSexeMedecin() {
		return sexeMedecin;
	}

	public void setSexeMedecin(String sexeMedecin) {
		this.sexeMedecin = sexeMedecin;
	}

	public String getCodeMedecin() {
		return codeMedecin;
	}

	public void setCodeMedecin(String codeMedecin) {
		this.codeMedecin = codeMedecin;
	}

	@Override
	public String toString() {
		return "Id Medecin:" + idMedecin + "\nNom Medecin:" + nomMedecin + "\nPrenom Medecin:" + prenomMedecin
				+ "\nSexe Medecin:" + sexeMedecin + "\nCode Medecin:" + codeMedecin + "\n";
	}

}
