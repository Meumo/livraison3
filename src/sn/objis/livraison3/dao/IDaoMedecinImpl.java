package sn.objis.livraison3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.livraison3.domaine.Medecin;
import sn.objis.livraison3.utils.MysqlConnection;

/**
 * Date Juillet 23-2018 # La classe 'IDaoMedecinImpl' fourni une implementation
 * de notre interface 'IDaoMedecin' qui etend l'interface 'IDaoGenerique'.
 * 
 * @author DIOUF Mamadou
 * @see IDaoMedecin
 */
public class IDaoMedecinImpl implements IDaoMedecin {

	/**
	 * Creation d'une instance de connexion pour acceder à la base de donnees
	 */
	Connection con = MysqlConnection.getInstanceConnection();

	@Override
	public void create(Medecin x) {
		try {
			String sql = "INSERT INTO medecin(nom_medecin,prenom_medecin,sexe_medecin,code_medecin) values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getNomMedecin());
			ps.setString(2, x.getPrenomMedecin());
			ps.setString(3, x.getSexeMedecin());
			ps.setString(4, x.getCodeMedecin());
			ps.executeUpdate();
			System.out.println("Insertion reussie");

		} catch (SQLException e) {
			System.out.println("Erreur lors de l'insertion");
			e.printStackTrace();
		}
	}

	@Override
	public List<Medecin> read() {
		List<Medecin> listMedecin = new ArrayList<>();
		try {
			String sql = "SELECT * FROM medecin";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Medecin medecin = new Medecin();

				medecin.setIdMedecin(rs.getLong("id_medecin"));
				medecin.setNomMedecin(rs.getString("nom_medecin"));
				medecin.setPrenomMedecin(rs.getString("prenom_medecin"));
				medecin.setSexeMedecin(rs.getString("sexe_medecin"));
				medecin.setCodeMedecin(rs.getString("code_medecin"));

				listMedecin.add(medecin);
			}
		} catch (SQLException e) {
			System.out.println("Erreur de la lecture");
			e.printStackTrace();
		}
		return listMedecin;
	}

	@Override
	public void update(Medecin x) {
		try {
			String sql = "UPDATE medecin SET nom_medecin=?, prenom_medecin=?, sexe_medecin=? WHERE code_medecin=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getNomMedecin());
			ps.setString(2, x.getPrenomMedecin());
			ps.setString(3, x.getSexeMedecin());
			ps.setString(4, x.getCodeMedecin());
			ps.executeUpdate();
			System.out.println("Mis à jour reussie");
		} catch (SQLException e) {
			System.out.println("Erreur Mis à jour ");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Medecin x) {
		try {
			String sql = "DELETE FROM medecin WHERE code_medecin=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getCodeMedecin());
			ps.executeUpdate();
			System.out.println("Suppression reussie");
		} catch (SQLException e) {
			System.out.println("Erreur lors de la suppression");
			e.printStackTrace();
		}
	}

	@Override
	public Medecin findByCode(String code) {
		Medecin medecinRecup = null;
		try {
			String sql = "SELECT * FROM medecin WHERE code_medecin=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, code);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				medecinRecup = new Medecin(rs.getLong("id_medecin"), rs.getString("nom_medecin"),
						rs.getString("prenom_medecin"), rs.getString("sexe_medecin"), rs.getString("code_medecin"));

			}
			System.out.println("Medecin trouvé\n");
		} catch (SQLException e) {
			System.out.println("Erreur lors de la recherche");
			e.printStackTrace();
		}

		return medecinRecup;
	}

}
