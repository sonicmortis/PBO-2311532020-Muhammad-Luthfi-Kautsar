package DAO;

import java.util.List;

import model.Customer;

public interface CustomerDAO {
	void save(Customer cus);
	public List<Customer> show();
	public void delete(String id);
	public void update(Customer cus);
}
