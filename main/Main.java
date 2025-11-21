package main;

public class Main {
	public static void main(String[] args) {
		Student s = new Student(4);
		
		System.out.println("--- Grades");
		s.displayGrades();
		s.displayStudentGPA();
		s.displayStudentWAM();
	}
}
