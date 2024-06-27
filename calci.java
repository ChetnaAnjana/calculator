package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calci {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 351, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(17, 6, 314, 61);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont (new Font("Wingdings", Font.PLAIN, 12));
		btnBackspace.setBounds(17, 71, 77, 61);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setBounds(17, 131, 77, 61);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setBounds(17, 189, 77, 61);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3.setBounds(17, 248, 77, 61);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("0");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setBounds(17, 305, 77, 61);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(98, 71, 77, 61);
		frame.getContentPane().add(btnClear);
		
		JButton btnNewButton_6 = new JButton("8");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setBounds(98, 131, 77, 61);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_7.setBounds(98, 189, 77, 61);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_8.getText();
				textField.setText(number);
			}
		});
		btnNewButton_8.setBounds(98, 248, 77, 61);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBounds(98, 305, 77, 61);
		frame.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setBounds(177, 71, 77, 61);
		frame.getContentPane().add(btn00);
		
		JButton btnNewButton_11 = new JButton("9");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_11.getText();
				textField.setText(number);
			}
		});
		btnNewButton_11.setBounds(177, 131, 77, 61);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("6");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_12.getText();
				textField.setText(number);
			}
		});
		btnNewButton_12.setBounds(177, 189, 77, 61);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_13.getText();
				textField.setText(number);
			}
		});
		btnNewButton_13.setBounds(177, 248, 77, 61);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+"){
					result=first+second;
					answer=String.format("%.2f", result); 
					textField.setText(answer);
				}
				else if(operation=="-"){
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					}
				else if(operation=="*"){
					result=first*second;
					answer=String.format("%.2f", result); 
					textField.setText(answer);
					}
				else if(operation=="/"){
					result=first/second;
					answer=String.format("%.2f", result); textField.setText(answer);
					}
				else if(operation=="%"){
					result=first%second;
					answer=String.format("%.2f", result); textField.setText(answer);
					}				
			}
		});
		btnEqual.setBounds(177, 305, 77, 61);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setBounds(254, 71, 77, 61);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setBounds(254, 131, 77, 61);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setBounds(254, 189, 77, 61);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
			
		});
		btnDivide.setBounds(254, 248, 77, 61);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setBounds(254, 305, 77, 61);
		frame.getContentPane().add(btnPercent);
	}
}
