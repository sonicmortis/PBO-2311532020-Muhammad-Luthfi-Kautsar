package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.OrderRepo;
import model.Order;
import table.TableOrder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrderFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableOrders;
	private JTextField txtTrxCount;

	OrderRepo ordr = new OrderRepo();
	List<Order> order;
	String idOrder = "";
	public String id;
	
	public void loadTableOrder() {
		order = ordr.show();
		TableOrder to = new TableOrder(order);
		tableOrders.setModel(to);;
		tableOrders.getTableHeader().setVisible(true);
	}
	
//	static String id = null;
	public void trxCount() {
//		int tempId = 0;
//		if (id==null) {
//			tempId = 1;
//		}else {
//			tempId = Integer.parseInt(id)+1;
//		}
//		
		
//		int tempId = 1;
//		if (tempId < 10) {
//			txtTrxCount.setText("TRX-00"+tempId);
//		}else if (tempId < 100) {
//			txtTrxCount.setText("TRX-0"+tempId);
//		}else {
//			txtTrxCount.setText("TRX-"+tempId);
//		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderFrame frame = new OrderFrame();
					frame.setVisible(true);
					frame.trxCount();
					frame.loadTableOrder();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public OrderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDataOrderan = new JLabel("DATA ORDERAN");
		lblDataOrderan.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDataOrderan.setBounds(23, 15, 195, 38);
		contentPane.add(lblDataOrderan);
		
		JButton btnCustomer = new JButton("Edit/Detail");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCustomer.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnCustomer.setBounds(577, 84, 96, 24);
		contentPane.add(btnCustomer);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (idOrder != "") {
					((OrderRepo) order).delete(idOrder);
				}else {
					JOptionPane.showMessageDialog(null, "Select Table Row First");
				}
			}
		});
		btnDelete.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnDelete.setBounds(467, 84, 96, 25);
		contentPane.add(btnDelete);
		
		JButton btnOrder = new JButton("Buat Order");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderDetail odf = new OrderDetail();
				odf.setVisible(true);
				odf.loadTableservice();
				odf.loadTable();
				odf.loadDataRp();
				odf.trxCount();
				
//				OrderDRepo odr = new OrderDRepo();
//				String lastOrderId = odr.getLastOrderIdFromDatabase(); 
//		        String newOrderId = generateOrderID(lastOrderId); 
				dispose();
			}
//			private String generateOrderID (String lastOrderId) {
//				int idNumber;
//				if (lastOrderId == null || lastOrderId.length() <4) {
//					idNumber = 1;
//				} else {
//					idNumber = Integer.parseInt(lastOrderId.substring(4));
//					idNumber++7
//					return String.format("TRX-406d", idNumber);
//				}
//			}
		});
		btnOrder.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnOrder.setBounds(23, 63, 181, 31);
		contentPane.add(btnOrder);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 119, 698, 254);
		contentPane.add(scrollPane);
		
		tableOrders = new JTable();
		tableOrders.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTrxCount.setText(tableOrders.getValueAt(tableOrders.getSelectedRow(),0).toString());
			}
		});
		tableOrders.setToolTipText("");
		tableOrders.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tableOrders.setFillsViewportHeight(true);
		tableOrders.setBackground(Color.WHITE);
		scrollPane.setViewportView(tableOrders);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame();
				mf.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnBack.setBounds(599, 381, 96, 31);
		contentPane.add(btnBack);
		
		txtTrxCount = new JTextField();
		txtTrxCount.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrxCount.setFont(new Font("SansSerif", Font.BOLD, 25));
		txtTrxCount.setEditable(false);
		txtTrxCount.setColumns(10);
		txtTrxCount.setBounds(457, 23, 230, 50);
		contentPane.add(txtTrxCount);
	}
}