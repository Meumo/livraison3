package sn.objis.livraison3.domaine;

/**
 * Date Juillet 23-2018 # la classe patient gere les etats d'un patient dans
 * notre application
 * 
 * @author DIOUF Mamadou
 * @since 2018
 * @version 1.0-SNAPSHOT
 */
public class Patient {
	/**
	 * Champ qui stocke l'identifiant d'un patient
	 */
	private long idPatient;
	/**
	 * Champ qui stocke le nom d'un patient
	 */
	private String nomPatient;
	/**
	 * Champ qui stocke le prenom d'un patient
	 */
	private String prenomPatient;
	/**
	 * Champ qui stocke le sexe d'un patient
	 */
	private String sexePatient;
	/**
	 * Champ qui stocke l'age d'un patient
	 */
	private int agePatient;
	/**
	 * Champ qui stocke l'adresse d'un patient
	 */
	private String adressePatient;
	/**
	 * Champ qui stocke l'assurance d'un patient
	 */
	private String assurancePatient;
	/**
	 * Champ qui stocke le code d'un patient
	 */
	private String codePatient;

	/**
	 * Constructeur sans arguments
	 */
	public Patient() {
		super();
	}

	/**
	 * Constructeur avec arguments (long idPatient, String nomPatient, String
	 * prenomPatient, String sexePatient, int agePatient, String adressePatient,
	 * String assurancePatient, String codePatient)
	 * 
	 * @param idPatient
	 *            Parametre qui stocke l'identifiant
	 * @param nomPatient
	 *            Parametre qui stocke le nom
	 * @param prenomPatient
	 *            Parametre qui stocke le prenom
	 * @param sexePatient
	 *            Parametre qui stocke le sexe
	 * @param agePatient
	 *            Parametre qui stocke l'age
	 * @param adressePatient
	 *            Parametre qui stocke l'adresse
	 * @param assurancePatient
	 *            Parametre qui stocke l'assurance
	 * @param codePatient
	 *            Parametre qui stocke le code
	 */
	public Patient(long idPatient, String nomPatient, String prenomPatient, String sexePatient, int agePatient,
			String adressePatient, String assurancePatient, String codePatient) {
		super();
		this.idPatient = idPatient;
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.sexePatient = sexePatient;
		this.agePatient = agePatient;
		this.adressePatient = adressePatient;
		this.assurancePatient = assurancePatient;
		this.codePatient = codePatient;
	}

	/**
	 * Constructeur avec arguments (String nomPatient, String prenomPatient, String
	 * sexePatient, int agePatient, String adressePatient, String assurancePatient,
	 * String codePatient)
	 * 
	 * @param nomPatient
	 *            Paramétre qui stocke le nom
	 * @param prenomPatient
	 *            Paramétre qui stocke le prenom
	 * @param sexePatient
	 *            Paramétre qui stocke le sexe
	 * @param agePatient
	 *            Paramétre qui stocke l'age
	 * @param adressePatient
	 *            Paramétre qui stocke l'adresse
	 * @param assurancePatient
	 *            Paramétre qui stocke l'assurance
	 * @param codePatient
	 *            Paramétre qui stocke le code
	 */
	public Patient(String nomPatient, String prenomPatient, String sexePatient, int agePatient, String adressePatient,
			String assurancePatient, String codePatient) {
		super();
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.sexePatient = sexePatient;
		this.agePatient = agePatient;
		this.adressePatient = adressePatient;
		this.assurancePatient = assurancePatient;
		this.codePatient = codePatient;
	}

	public long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	public String getPrenomPatient() {
		return prenomPatient;
	}

	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}

	public String getSexePatient() {
		return sexePatient;
	}

	public void setSexePatient(String sexePatient) {
		this.sexePatient = sexePatient;
	}

	public int getAgePatient() {
		return agePatient;
	}

	public void setAgePatient(int agePatient) {
		this.agePatient = agePatient;
	}

	public String getAdressePatient() {
		return adressePatient;
	}

	public void setAdressePatient(String adressePatient) {
		this.adressePatient = adressePatient;
	}

	public String getAssurancePatient() {
		return assurancePatient;
	}

	public void setAssurancePatient(String assurancePatient) {
		this.assurancePatient = assurancePatient;
	}

	public String getCodePatient() {
		return codePatient;
	}

	public void setCodePatient(String codePatient) {
		this.codePatient = codePatient;
	}

	@Override
	public String toString() {
		return "\nId Patient:" + idPatient + "\nNom Patient:" + nomPatient + "\nPrenom Patient:" + prenomPatient
				+ "\nSexe Patient:" + sexePatient + "\nAge Patient:" + agePatient + "\nAdresse Patient:"
				+ adressePatient + "\nAssurance Patient:" + assurancePatient + "\nCode Patient:" + codePatient + "\n";
	}

}
