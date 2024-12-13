package DAO;

import java.util.List;

import model.OrderDetailModel;

public interface OrderDDAO {
	void save(OrderDetailModel odm);
	public List<OrderDetailModel> show();
	public void delete(String id);
	public void update(OrderDetailModel odm);
}
