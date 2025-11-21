package main;

/*
 * This program will take in a single students grade and produce the students WAM and GPA.
 * 
 * 1. Program will take a pre-defined array of grades and display the correct GPA and WAM. DONE
 * 2. Program will take user input through the terminal and display correct GPA and WAM. DONE
 * 3. Program will take user input in a GUI - Produce results through the terminal
 * 4. Program will take user input in a GUI - Produce results in the GUI.
 * 5. Make the GUI more visually pleasing to the user. Swing or JavaFX
 * */

public class Main {
	public static void main(String[] args) {
		
		int number_of_grades = 4;
		Student s = new Student(number_of_grades);
		System.out.println("--- Before");
		s.displayGrades();
		s.displayStudentGPA();
		s.displayStudentWAM();
		
		System.out.println("--- After");
		System.out.println("Enter Student Grades: ");
		s.inputGrades();
		
		s.displayGrades();
		s.displayStudentGPA();
		s.displayStudentWAM();
		
	}
}
