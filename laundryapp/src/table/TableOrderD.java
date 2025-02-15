package table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.OrderDetailModel;

public class TableOrderD extends AbstractTableModel {
	List<OrderDetailModel> ls;
	
	private String[] columnNames = {"ID", "Jenis", "Quantity", "Total"};
	
	public TableOrderD(List<OrderDetailModel> ls) {
		this.ls = ls;
	}
	
	public int getRowCount() {
		return ls.size();
	}
	
	public int getColumnCount() {
		return 4;
	}
	
	public String getColumnName(int column) {
		return columnNames[column];
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0:
			return ls.get(rowIndex).getId();
		case 1:
			return ls.get(rowIndex).getJenis();
		case 2:
			return ls.get(rowIndex).getQty();
		case 3:
			return ls.get(rowIndex).getTotal();
		default:
			return null;
		}
	}
}
