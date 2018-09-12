package sn.objis.livraison3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.livraison3.domaine.Secretaire;
import sn.objis.livraison3.utils.MysqlConnection;

/**
 * Date Juillet 23-2018 # La classe 'IDaoSecretaireImpl' fourni une
 * implementation de notre interface 'IDaoSecretaire' qui etend l'interface
 * 'IDaoGenerique'.
 * 
 * @author DIOUF Mamadou
 * @see IDaoSecretaire
 */
public class IDaoSecretaireImpl implements IDaoSecretaire {

	/**
	 * Creation d'une instance de connexion pour acceder à la base de donnees
	 */
	Connection con = MysqlConnection.getInstanceConnection();

	@Override
	public void create(Secretaire x) {
		try {
			String sql = "INSERT INTO secretaire(nom_secretaire,prenom_secretaire,code_secretaire) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getNomSecretaire());
			ps.setString(2, x.getPrenomSecretaire());
			ps.setString(3, x.getCodeSecretaire());
			ps.executeUpdate();
			System.out.println("Insertion reussie");

		} catch (SQLException e) {
			System.out.println("Erreur lors de l'insertion");
			e.printStackTrace();
		}
	}

	@Override
	public List<Secretaire> read() {
		List<Secretaire> listSecretaire = new ArrayList<>();
		try {
			String sql = "SELECT * FROM secretaire";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Secretaire secretaire = new Secretaire();

				secretaire.setIdSecretaire(rs.getLong("id_secretaire"));
				secretaire.setNomSecretaire(rs.getString("nom_secretaire"));
				secretaire.setPrenomSecretaire(rs.getString("prenom_secretaire"));
				secretaire.setCodeSecretaire(rs.getString("code_secretaire"));

				listSecretaire.add(secretaire);
			}
		} catch (SQLException e) {
			System.out.println("Erreur de la lecture");
			e.printStackTrace();
		}
		return listSecretaire;
	}

	@Override
	public void update(Secretaire x) {
		try {
			String sql = "UPDATE secretaire SET nom_secretaire=?, prenom_secretaire=?  WHERE code_secretaire=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getNomSecretaire());
			ps.setString(2, x.getPrenomSecretaire());
			ps.setString(3, x.getCodeSecretaire());
			ps.executeUpdate();
			System.out.println("Mis à jour reussie");
		} catch (SQLException e) {
			System.out.println("Erreur Mis à jour ");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Secretaire x) {
		try {
			String sql = "DELETE FROM secretaire WHERE code_secretaire=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, x.getCodeSecretaire());
			ps.executeUpdate();
			System.out.println("Suppression reussie");
		} catch (SQLException e) {
			System.out.println("Erreur lors de la suppression");
			e.printStackTrace();
		}
	}

	@Override
	public Secretaire findByCode(String code) {
		Secretaire secretaireRecup = null;
		try {
			String sql = "SELECT * FROM secretaire WHERE code_secretaire=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, code);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				secretaireRecup = new Secretaire(rs.getLong("id_secretaire"), rs.getString("nom_secretaire"),
						rs.getString("prenom_secretaire"), rs.getString("code_secretaire"));

			}
			// System.out.println("Secretaire trouvé\n");
		} catch (SQLException e) {
			System.out.println("Erreur lors de la recherche");
			e.printStackTrace();
		}

		return secretaireRecup;
	}

}
