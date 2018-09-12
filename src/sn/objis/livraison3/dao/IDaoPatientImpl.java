package sn.objis.livraison3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.livraison3.domaine.Patient;
import sn.objis.livraison3.utils.MysqlConnection;

/**
 * Date Juillet 23-2018 # La classe 'IDaoPatientImpl' fourni une implementation
 * de notre interface 'IDaoPatient' qui etend l'interface 'IDaoGenerique'.
 * 
 * @author DIOUF Mamadou
 * @see IDaoPatient
 */
public class IDaoPatientImpl implements IDaoPatient {

	/**
	 * Creation d'une instance de connexion pour acceder à la base de donnees
	 */
	Connection con = MysqlConnection.getInstanceConnection();

	@Override
	public void create(Patient x) {
		try {
			String sql = "INSERT INTO patient(nom_patient, prenom_patient, sexe_patient, age_patient, adresse_patient, assurance, code_patient)"
					+ " VALUES (?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getNomPatient());
			ps.setString(2, x.getPrenomPatient());
			ps.setString(3, x.getSexePatient());
			ps.setInt(4, x.getAgePatient());
			ps.setString(5, x.getAdressePatient());
			ps.setString(6, x.getAssurancePatient());
			ps.setString(7, x.getCodePatient());
			ps.executeUpdate();

			System.out.println("Ajout reussi");
		} catch (SQLException e) {
			System.out.println("Erreur lors de l'ajout");
			e.printStackTrace();
		}
	}

	@Override
	public List<Patient> read() {
		List<Patient> listPatient = new ArrayList<>();
		try {
			String sql = "SELECT * FROM patient";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Patient patient = new Patient();
				patient.setIdPatient(rs.getLong("id_patient"));
				patient.setNomPatient(rs.getString("nom_patient"));
				patient.setPrenomPatient(rs.getString("prenom_patient"));
				patient.setSexePatient(rs.getString("sexe_patient"));
				patient.setAgePatient(rs.getInt("age_patient"));
				patient.setAdressePatient(rs.getString("adresse_patient"));
				patient.setAssurancePatient(rs.getString("assurance"));
				patient.setCodePatient(rs.getString("code_patient"));

				listPatient.add(patient);
			}
		} catch (SQLException e) {
			System.out.println("Erreur lors de la lecture");
			e.printStackTrace();
		}
		return listPatient;
	}

	@Override
	public void update(Patient x) {
		try {
			String sql = "UPDATE patient SET nom_patient=?, prenom_patient=?, sexe_patient=?, age_patient=?, adresse_patient=?, assurance=? WHERE code_patient=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getNomPatient());
			ps.setString(2, x.getPrenomPatient());
			ps.setString(3, x.getSexePatient());
			ps.setInt(4, x.getAgePatient());
			ps.setString(5, x.getAdressePatient());
			ps.setString(6, x.getAssurancePatient());
			ps.setString(7, x.getCodePatient());
			ps.executeUpdate();
			System.out.println("Mis à jour reussie");
		} catch (SQLException e) {
			System.out.println("Erreur Mis à jour ");
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Patient x) {
		try {
			String sql = "DELETE FROM patient WHERE code_patient=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getCodePatient());
			ps.executeUpdate();
			System.out.println("Suppression reussie");
		} catch (SQLException e) {
			System.out.println("Erreur lors de la suppression");
			e.printStackTrace();
		}
	}

	@Override
	public Patient findByCode(String code) {
		Patient patientRecup = null;
		try {
			String sql = "SELECT * FROM patient WHERE code_patient=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, code);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				patientRecup = new Patient(rs.getLong("id_patient"), rs.getString("nom_patient"),
						rs.getString("prenom_patient"), rs.getString("sexe_patient"), rs.getInt("age_patient"),
						rs.getString("adresse_patient"), rs.getString("assurance"), rs.getString("code_patient"));

			}
			// System.out.println("Patient trouvé\n");
		} catch (SQLException e) {
			System.out.println("Erreur lors de la recherche");
			e.printStackTrace();
		}

		return patientRecup;
	}

}
