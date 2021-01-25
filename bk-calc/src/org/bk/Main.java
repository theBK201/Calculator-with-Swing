package org.bk;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frmBksCalculator;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Main window = new Main();
					window.frmBksCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static String replacing(String s) {
		String [] chars = {"+", "-", "÷", "x"};
		
		for (String character : chars) {
			if(s.contains(character)) {
				s = s.replace(character, " " + character + " ");
			}
		}
		return s;
	}
	
	private void initialize() {
		
		frmBksCalculator = new JFrame();
		frmBksCalculator.setTitle("BK202's calculator");
		frmBksCalculator.setResizable(false);
		frmBksCalculator.setBounds(100, 100, 380, 300);
		frmBksCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBksCalculator.getContentPane().setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textField.setFont(new Font("Dialog", Font.BOLD, 12));
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setBounds(10, 10, 358, 41);
		frmBksCalculator.getContentPane().add(textField);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setFocusPainted(false);
		btnNum1.setFocusTraversalKeysEnabled(false);
		btnNum1.setBackground(SystemColor.controlHighlight);
		btnNum1.setBounds(12, 190, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum1);
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setFocusPainted(false);
		btnNum2.setFocusTraversalKeysEnabled(false);
		btnNum2.setBackground(SystemColor.controlHighlight);
		btnNum2.setBounds(104, 190, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum2);
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setFocusPainted(false);
		btnNum3.setFocusTraversalKeysEnabled(false);
		btnNum3.setBackground(SystemColor.controlHighlight);
		btnNum3.setBounds(196, 190, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum3);
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setFocusPainted(false);
		btnNum4.setFocusTraversalKeysEnabled(false);
		btnNum4.setBackground(SystemColor.controlHighlight);
		btnNum4.setBounds(12, 148, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum4);
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setFocusPainted(false);
		btnNum5.setFocusTraversalKeysEnabled(false);
		btnNum5.setBackground(SystemColor.controlHighlight);
		btnNum5.setBounds(104, 148, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum5);
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setFocusPainted(false);
		btnNum6.setFocusTraversalKeysEnabled(false);
		btnNum6.setBackground(SystemColor.controlHighlight);
		btnNum6.setBounds(196, 148, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum6);
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		btnNum7.setFocusPainted(false);
		btnNum7.setFocusTraversalKeysEnabled(false);
		btnNum7.setBackground(SystemColor.controlHighlight);
		btnNum7.setBounds(12, 106, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum7);
		
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setFocusPainted(false);
		btnNum8.setFocusTraversalKeysEnabled(false);
		btnNum8.setBackground(SystemColor.controlHighlight);
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		btnNum8.setBounds(104, 106, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setFocusPainted(false);
		btnNum9.setFocusTraversalKeysEnabled(false);
		btnNum9.setBackground(SystemColor.controlHighlight);
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		btnNum9.setBounds(196, 106, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum9);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setFocusPainted(false);
		btnNum0.setFocusTraversalKeysEnabled(false);
		btnNum0.setBackground(SystemColor.controlHighlight);
		btnNum0.setBounds(12, 232, 80, 30);
		frmBksCalculator.getContentPane().add(btnNum0);
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFocusPainted(false);
		btnPlus.setFocusTraversalKeysEnabled(false);
		btnPlus.setBackground(SystemColor.inactiveCaptionBorder);
		btnPlus.setBounds(288, 232, 80, 30);
		frmBksCalculator.getContentPane().add(btnPlus);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFocusPainted(false);
		btnMinus.setFocusTraversalKeysEnabled(false);
		btnMinus.setBackground(SystemColor.inactiveCaptionBorder);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		btnMinus.setBounds(288, 190, 80, 30);
		frmBksCalculator.getContentPane().add(btnMinus);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFocusPainted(false);
		btnEquals.setFocusTraversalKeysEnabled(false);
		btnEquals.setForeground(Color.WHITE);
		btnEquals.setBackground(new Color(0, 153, 255));
		btnEquals.setBounds(196, 232, 80, 30);
		frmBksCalculator.getContentPane().add(btnEquals);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String input = textField.getText();
				input = replacing(input);
				String [] stringParts = input.split(" ");
				double num1= Double.parseDouble(stringParts[0]);
				double num2= Double.parseDouble(stringParts[2]);
				double result=0;
				
				switch(stringParts[1]) {
				case "+":
						result= num1 + num2;
						textField.setText(Double.toString(result));
					break;
				case "-":
						result= num1 - num2;
						textField.setText(Double.toString(result));
					break;
				case "x":
						result= num1 * num2;
						textField.setText(Double.toString(result));
					break;
				case "÷":
						result= num1 / num2;
						textField.setText(Double.toString(result));
					break;
				}
				
				if(textField.getText() == "") {
					JOptionPane.showMessageDialog(null, "Аз съм Албански калкулатор, сметни си го сам!"
							+ "\nI am an Albanian calculator, do it yourself!"
							+ "\nIch bin eine Albanische kalkulator, rechne mal alleine!"
							+ "\nJe suis un calculateur albanais, calculez-le vous-même !"
							+ "\nЯ албанский калькулятор, рассчитайте сами!"
							+ "\nOlen albanialainen laskin, laske se itse!"
							+ "\nΕίμαι αλβανική αριθμομηχανή, υπολογίστε μόνοι σας!");
				}
			}
		});
		
		JButton btnDivide = new JButton("÷");
		btnDivide.setFocusPainted(false);
		btnDivide.setFocusTraversalKeysEnabled(false);
		btnDivide.setBackground(SystemColor.inactiveCaptionBorder);
		btnDivide.setBounds(288, 106, 80, 30);
		frmBksCalculator.getContentPane().add(btnDivide);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.setFocusPainted(false);
		btnMultiply.setFocusTraversalKeysEnabled(false);
		btnMultiply.setBackground(SystemColor.inactiveCaptionBorder);
		btnMultiply.setBounds(288, 148, 80, 30);
		frmBksCalculator.getContentPane().add(btnMultiply);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFocusPainted(false);
		btnPercent.setFocusTraversalKeysEnabled(false);
		btnPercent.setBackground(SystemColor.inactiveCaptionBorder);
		btnPercent.setBounds(196, 64, 80, 30);
		frmBksCalculator.getContentPane().add(btnPercent);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JButton btnDecPoint = new JButton(".");
		btnDecPoint.setFocusPainted(false);
		btnDecPoint.setFocusTraversalKeysEnabled(false);
		btnDecPoint.setBackground(SystemColor.controlHighlight);
		btnDecPoint.setBounds(104, 232, 80, 30);
		frmBksCalculator.getContentPane().add(btnDecPoint);
		btnDecPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnLeftBracket = new JButton("(");
		btnLeftBracket.setFocusPainted(false);
		btnLeftBracket.setFocusTraversalKeysEnabled(false);
		btnLeftBracket.setBackground(SystemColor.inactiveCaptionBorder);
		btnLeftBracket.setBounds(12, 64, 80, 30);
		frmBksCalculator.getContentPane().add(btnLeftBracket);
		btnLeftBracket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnRightBracket = new JButton(")");
		btnRightBracket.setFocusPainted(false);
		btnRightBracket.setFocusTraversalKeysEnabled(false);
		btnRightBracket.setBackground(SystemColor.inactiveCaptionBorder);
		btnRightBracket.setBounds(104, 64, 80, 30);
		frmBksCalculator.getContentPane().add(btnRightBracket);
		btnRightBracket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+((JButton)arg0.getSource()).getText());
			}
		});
		
		JButton btnBackspace = new JButton("AC");
		btnBackspace.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2 && !e.isConsumed()) {
					e.consume();
					textField.setText("");
				}
			}
		});
		btnBackspace.setFocusPainted(false);
		btnBackspace.setFocusTraversalKeysEnabled(false);
		btnBackspace.setBackground(SystemColor.inactiveCaptionBorder);
		btnBackspace.setBounds(288, 64, 80, 30);
		frmBksCalculator.getContentPane().add(btnBackspace);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length() == 0) return;
				textField.setText(textField.getText().substring(0,textField.getText().length()-1));
			}
		});
	}
}
