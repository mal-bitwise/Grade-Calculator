package main;

/* PROJECT DESCRIPTION
 * This program will take in a students grade and produce the students WAM and GPA.
 * 
 * 1. Program will take a pre-defined array of grades and display the correct GPA and WAM. DONE
 * 2. Program will take user input through the terminal and display correct GPA and WAM. DONE
 * 3. Program will take user input in a GUI - Produce results through the terminal DONE
 * 4. Program will take user input in a GUI - Produce results in the GUI.
 * 5. Make the GUI more visually pleasing to the user.
 * 
 */

public class Main {
	public static void main(String[] args) {
		
		int number_of_grades = 4;
		Student s = new Student();
		System.out.println("Enter Student Grades: ");
		
		UI ui = new UI(s);
		
	}
}
