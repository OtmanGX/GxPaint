import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MultiWindow {

	private JFrame frame;
	private JPanel First;
	private JPanel Second;
	private JTextField textField;
 JRadioButton rdbtnNewRadioButton;
 JRadioButton rdbtnNewRadioButton_1;
 JRadioButton rdbtnNewRadioButton_2;
 JRadioButton rdbtnNewRadioButton_3;
 JRadioButton rdbtnNewRadioButton_4;
 JRadioButton rdbtnNewRadioButton_5;
 JRadioButton rdbtnNewRadioButton_6;
 JRadioButton rdbtnNewRadioButton_7;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiWindow window = new MultiWindow();
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
	public MultiWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 628, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Main = new JPanel();
		Main.setBackground(new Color(25, 25, 112));
		frame.getContentPane().add(Main, "name_164865890516381");
		Main.setLayout(null);
		
		JButton btnNewButton = new JButton("Drink");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		 First.setVisible(true);
		 Main.setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(37, 218, 224, 78);
		Main.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fruit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second.setVisible(true);
				Main.setVisible(false);
				 
			}
		});
		btnNewButton_1.setBackground(new Color(60, 179, 113));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(360, 218, 224, 78);
		Main.add(btnNewButton_1);
		
		JLabel lblYourOrder = new JLabel("your order :");
		lblYourOrder.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		lblYourOrder.setForeground(Color.ORANGE);
		lblYourOrder.setBounds(70, 57, 156, 54);
		Main.add(lblYourOrder);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 22));
		textField.setBounds(221, 69, 351, 40);
		Main.add(textField);
		textField.setColumns(10);
		
		First = new JPanel();
		First.setBackground(new Color(46, 139, 87));
		frame.getContentPane().add(First, "name_164879577734726");
		First.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Drink");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 34));
		lblNewLabel.setBounds(235, 12, 162, 65);
		First.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("back to Main");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str = new String();
				if (rdbtnNewRadioButton.isSelected() ) {
					str = "Caffe , ";
				}
				if (rdbtnNewRadioButton_1.isSelected() ) {
					str = str+"Tea , ";
				}
				if (rdbtnNewRadioButton_2.isSelected() ) {
					str = str+"Milk , ";
				}
				if (rdbtnNewRadioButton_3.isSelected() ) {
					str = str+"Cola , ";
				}
				
				textField.setText(str);
				
				
				Main.setVisible(true);
				First.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_2.setForeground(new Color(255, 255, 0));
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(421, 276, 182, 48);
		First.add(btnNewButton_2);
		
		rdbtnNewRadioButton = new JRadioButton("Caffe");
		rdbtnNewRadioButton.setFont(new Font("Dialog", Font.BOLD, 30));
		rdbtnNewRadioButton.setBackground(new Color(0, 250, 154));
		rdbtnNewRadioButton.setBounds(43, 106, 131, 37);
		First.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Tea");
		rdbtnNewRadioButton_1.setFont(new Font("Dialog", Font.BOLD, 30));
		rdbtnNewRadioButton_1.setBackground(new Color(0, 250, 154));
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1.setBounds(43, 158, 131, 40);
		First.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Milk");
		rdbtnNewRadioButton_2.setBackground(new Color(0, 250, 154));
		rdbtnNewRadioButton_2.setFont(new Font("Dialog", Font.BOLD, 30));
		rdbtnNewRadioButton_2.setBounds(43, 211, 131, 37);
		First.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Cola");
		rdbtnNewRadioButton_3.setBackground(new Color(0, 250, 154));
		rdbtnNewRadioButton_3.setFont(new Font("Dialog", Font.BOLD, 30));
		rdbtnNewRadioButton_3.setBounds(43, 263, 131, 37);
		First.add(rdbtnNewRadioButton_3);
		
		Second = new JPanel();
		Second.setBackground(new Color(102, 0, 153));
		frame.getContentPane().add(Second, "name_164901994567924");
		Second.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Second");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 42));
		lblNewLabel_1.setBounds(234, 25, 180, 72);
		Second.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Back to Main");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str = new String();
				if (rdbtnNewRadioButton_4.isSelected() ) {
					str = "Apple , ";
				}
				if (rdbtnNewRadioButton_5.isSelected() ) {
					str = str+"Apricot , ";
				}
				if (rdbtnNewRadioButton_6.isSelected() ) {
					str = str+"Banana , ";
				}
				if (rdbtnNewRadioButton_7.isSelected() ) {
					str = str+"Kiwi , ";
				}
				
				textField.setText(str);
				
				
				
				
				Main.setVisible(true);
				Second.setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 19));
		btnNewButton_3.setBackground(new Color(25, 25, 112));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(372, 267, 228, 65);
		Second.add(btnNewButton_3);
		
		rdbtnNewRadioButton_4 = new JRadioButton("Apple");
		rdbtnNewRadioButton_4.setBackground(Color.ORANGE);
		rdbtnNewRadioButton_4.setFont(new Font("Dialog", Font.BOLD, 30));
		rdbtnNewRadioButton_4.setBounds(40, 81, 142, 52);
		Second.add(rdbtnNewRadioButton_4);
		
		rdbtnNewRadioButton_5 = new JRadioButton("Apricot");
		rdbtnNewRadioButton_5.setBackground(Color.ORANGE);
		rdbtnNewRadioButton_5.setFont(new Font("Dialog", Font.BOLD, 30));
		rdbtnNewRadioButton_5.setBounds(39, 151, 173, 48);
		Second.add(rdbtnNewRadioButton_5);
		
		rdbtnNewRadioButton_6 = new JRadioButton("Banana");
		rdbtnNewRadioButton_6.setFont(new Font("Dialog", Font.BOLD, 30));
		rdbtnNewRadioButton_6.setBackground(Color.ORANGE);
		rdbtnNewRadioButton_6.setBounds(40, 217, 180, 48);
		Second.add(rdbtnNewRadioButton_6);
		
		rdbtnNewRadioButton_7 = new JRadioButton("Kiwi");
		rdbtnNewRadioButton_7.setBackground(Color.ORANGE);
		rdbtnNewRadioButton_7.setFont(new Font("Dialog", Font.BOLD, 30));
		rdbtnNewRadioButton_7.setBounds(40, 280, 149, 44);
		Second.add(rdbtnNewRadioButton_7);
	}
}
