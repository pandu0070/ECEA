package MOVIE_TB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket_Booking {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_Booking window = new Ticket_Booking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticket_Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 918, 561);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(240, 11, 473, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(67, 82, 197, 60);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TIME:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(67, 142, 197, 60);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("DATE:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(67, 202, 197, 60);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("TICKETS:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1.setBounds(67, 259, 197, 60);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JComboBox M1 = new JComboBox();
		M1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		M1.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "BAHUBALI 2", "VIRUPAKSHA", "AVATAR 2", "RAVANASURA"}));
		M1.setBounds(274, 82, 439, 46);
		frame.getContentPane().add(M1);
		
		JComboBox T1 = new JComboBox();
		T1.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "12:30PM", "03:30PM", "06:30PM", "09:30PM"}));
		T1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		T1.setBounds(274, 142, 439, 46);
		frame.getContentPane().add(T1);
		
		JComboBox D1 = new JComboBox();
		D1.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "01-05-2023", "02-05-2023", "03-05-2023", "04-05-2023", "05-05-2023", "06-05-2023", "07-05-2023", "08-05-2023", "09-05-2023", "10-05-2023", "11-05-2023"}));
		D1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		D1.setBounds(274, 202, 439, 46);
		frame.getContentPane().add(D1);
		
		JComboBox T2 = new JComboBox();
		T2.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "1", "2", "3", "4"}));
		T2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		T2.setBounds(274, 259, 439, 46);
		frame.getContentPane().add(T2);
		
		JButton btnNewButton = new JButton("BOOK TICKETS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String m=(String) M1.getSelectedItem();
			    String t1=(String) T1.getSelectedItem();
			    String d=(String) D1.getSelectedItem();
			    String t2=(String) T2.getSelectedItem();
			    int n=Integer.parseInt(t2);
			    int bill = 0;
			    if(m.equals("BAHUBALI 2"))
			    {
			    	bill=n*200;
			    }
			    else if(m.equals("VIRUPAKSHA"))
			    {
			    	bill=n*250;
			    }
			    else if(m.equals("AVATAR 2"))
			    {
			    	bill=n*400;
			    }
			    else if(m.equals("RAVANASURA"))
			    {
			    	bill=n*190;
			    }
			    else
			    {
			    	JOptionPane.showMessageDialog(btnNewButton,"INVALID!");
			    }
			    JOptionPane.showMessageDialog(btnNewButton,"Thank you!"+"\nYour Movie:"+m+"\nTime:"+t1+"\nDate:"+d+"\nYour Tickets:"+n+"\nYour Bill:Rs."+bill);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(335, 366, 271, 60);
		frame.getContentPane().add(btnNewButton);
	}
}
