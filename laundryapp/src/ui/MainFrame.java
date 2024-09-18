package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Laundry Apps");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle.setBounds(10, 21, 416, 38);
		contentPane.add(lblTitle);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnOrder.setBounds(10, 79, 121, 47);
		contentPane.add(btnOrder);
		
		JButton btnService = new JButton("Service");
		btnService.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnService.setBounds(159, 79, 121, 47);
		contentPane.add(btnService);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnCustomer.setBounds(305, 79, 121, 47);
		contentPane.add(btnCustomer);
		
		JButton btnUser = new JButton("User");
		btnUser.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnUser.setBounds(10, 136, 121, 47);
		contentPane.add(btnUser);
		
		JButton btnReport = new JButton("Report");
		btnReport.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnReport.setBounds(159, 136, 121, 47);
		contentPane.add(btnReport);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnProfile.setBounds(305, 136, 121, 47);
		contentPane.add(btnProfile);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFrame lf = new LoginFrame();
				lf.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnBack.setBounds(10, 208, 416, 33);
		contentPane.add(btnBack);
	}

}