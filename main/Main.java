package main;

public class Main {
	static int size;
	static int[] grades;
	static int average = 0;
	

	public static void main(String[] args) {
		
		Student s = new Student(4);
		
		System.out.println("--- Grades");
		s.displayArray();
		s.inputGrades();
		System.out.println("--- Grades");
		s.displayArray();
		
		System.out.println("WAM & GPA");

		System.out.println(""+s.getTotalWAM());
		
		System.out.println(""+s.getTotalGPA());
	}	
}
