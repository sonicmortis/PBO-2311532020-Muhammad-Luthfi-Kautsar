package CRUDCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO {
	 private Connection connection;

	    public CustomerDAO() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }

	    public void createCustomer(Customer customer) {
	        String query = "INSERT INTO customers (id, name, email) VALUES (?, ?, ?)";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setInt(1, customer.id);
	            stmt.setString(2, customer.name);
	            stmt.setString(3, customer.email);
	            stmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public Customer readCustomer(int id) {
	        String query = "SELECT * FROM customers WHERE id = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setInt(1, id);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                return new Customer.CustomerBuilder()
	                        .setId(rs.getInt("id"))
	                        .setName(rs.getString("name"))
	                        .setEmail(rs.getString("email"))
	                        .build();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    public void updateCustomer(Customer customer) {
	        String query = "UPDATE customers SET name = ?, email = ? WHERE id = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, customer.name);
	            stmt.setString(2, customer.email);
	            stmt.setInt(3, customer.id);
	            stmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void deleteCustomer(int id) {
	        String query = "DELETE FROM customers WHERE id = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setInt(1, id);
	            stmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
