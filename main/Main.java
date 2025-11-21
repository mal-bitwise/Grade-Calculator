package main;

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
