package sn.objis.livraison3.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sn.objis.livraison3.utils.MysqlConnection;

/**
 * Date Juillet 23-2018 # La classe 'GenerateCode' contient des methodes qui
 * generent les codes des differents objets de notre application.
 * 
 * @author DIOUF Mamadou
 *
 */
public class GenerateCode {

	/**
	 * Creation d'une instance de connexion pour acceder à la base de donnees
	 */
	Connection con = MysqlConnection.getInstanceConnection();

	/**
	 * La methode 'generateCodeMedecin' a pour role de creer le code d'un medecin et
	 * de le retourner.
	 * 
	 * @return une chaine (String) le code cree.
	 */
	public String generateCodeMedecin() {
		int sufMed = 0;
		String prefMed = null;
		try {
			String sql = "SELECT * FROM code";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				prefMed = rs.getString("code_med");
				sufMed = rs.getInt("suf_med");
				String req = "UPDATE code SET suf_med=? WHERE id_code=?";
				PreparedStatement ps = con.prepareStatement(req);
				ps.setInt(1, sufMed + 1);
				ps.setLong(2, 1);
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return prefMed + sufMed;
	}

	/**
	 * La methode 'generateCodePatient' a pour role de creer le code d'un patient et
	 * de le retourner.
	 * 
	 * @return une chaine (String) le code cree
	 */
	public String generateCodePatient() {
		int sufPat = 0;
		String prefPat = null;
		try {
			String sql = "SELECT * FROM code";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				prefPat = rs.getString("code_pat");
				sufPat = rs.getInt("suf_pat");
				String req = "UPDATE code SET suf_pat=? WHERE id_code=?";
				PreparedStatement ps = con.prepareStatement(req);
				ps.setInt(1, sufPat + 1);
				ps.setLong(2, 1);
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return prefPat + sufPat;
	}

	/**
	 * La methode 'generateCodeSecretaire' a pour rôle de creer le code d'un
	 * secretaire et de le retourner.
	 * 
	 * @return une chaine (String) le code cree
	 */
	public String generateCodeSecretaire() {
		int sufSec = 0;
		String preSec = null;
		try {
			String sql = "SELECT * FROM code";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				preSec = rs.getString("code_sec");
				sufSec = rs.getInt("suf_sec");
				String req = "UPDATE code SET suf_sec=? WHERE id_code=?";
				PreparedStatement ps = con.prepareStatement(req);
				ps.setInt(1, sufSec + 1);
				ps.setLong(2, 1);
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return preSec + sufSec;
	}

}
