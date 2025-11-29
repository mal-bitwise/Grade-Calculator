package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI implements ActionListener{
	
	JTextField textfield;
	JPanel panel;
	JFrame frame;
	
	JButton enter = new JButton("Enter");
	JButton reset = new JButton("Reset");
	JButton show = new JButton("Show");
	
	JButton buttons[] = new JButton[2];	
	Font font1 = new Font("Ink Free",Font.BOLD,28);
	
	Student s;
	public UI(Student s) {
		createWindow(500,500);
		this.s = s;
	}
	
	public void createWindow(int w, int h) {
		enter.addActionListener(this);
		reset.addActionListener(this);
		show.addActionListener(this);
		enter.setFont(font1);
		reset.setFont(font1);
		show.setFont(font1);
		
		
		frame = new JFrame("Grade Calculator");
		frame.setPreferredSize(new Dimension(w,h));
		frame.setMinimumSize(new Dimension(w,h));
		frame.setMaximumSize(new Dimension(w,h));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new BorderLayout(10,10));
		
		textfield = new JTextField();
		textfield.setFont(font1);
		textfield.setHorizontalAlignment(JTextField.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,2,10,10));
		buttonPanel.add(enter);
		buttonPanel.add(reset);
		buttonPanel.add(show);
		panel.add(textfield, BorderLayout.CENTER);
		panel.add(buttonPanel, BorderLayout.SOUTH);
		
		panel.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
		
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Enter") {
			String text = textfield.getText();
			float grade = Float.parseFloat(text);
			s.inputGradeTest(grade);
			
			textfield.setText("");
		}else if(e.getActionCommand() == "Show") {
			s.displayGrades();
			s.displayStudentGPA();
			s.displayStudentWAM();
		}else {
			s.resetGrades();
		}
	}
}


