package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Customer;
import config.Database;

public class CustomerRepo implements CustomerDAO{
	private Connection connection;
	final String insert = "INSERT INTO customer (nama, alamat, noHp) VALUES (?,?,?);";
	final String select = "SELECT * FROM customer;";
	final String delete = "DELETE FROM customer WHERE id=?;";
	final String update = "UPDATE customer SET nama=?, alamat=?, noHp=? WHERE id=?;";
	
	public CustomerRepo() {
		connection = Database.koneksi();
	}
	
	@Override
	public void save(Customer cus) {
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(insert);
			st.setString(1, cus.getNama());
			st.setString(2, cus.getAlamat());
			st.setString(3, cus.getNoHp());
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public List<Customer> show(){
		List<Customer> ls = null;
		try {
			ls = new ArrayList<Customer>();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next()) {
				Customer cus = new Customer();
				cus.setId(rs.getString("id"));
				cus.setNama(rs.getString("nama"));
				cus.setAlamat(rs.getString("alamat"));
				cus.setNoHp(rs.getString("noHp"));
				ls.add(cus);
			}
		}catch(SQLException e) {
			Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
		}
		return ls;
	}
	@Override
	public void update(Customer cus) {
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(update);
			st.setString(1,  cus.getNama());;
			st.setString(2,  cus.getAlamat());;
			st.setString(3,  cus.getNoHp());;
			st.setString(4,  cus.getId());;
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void delete(String id) {
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(delete);
					st.setString(1,id);
			st.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
