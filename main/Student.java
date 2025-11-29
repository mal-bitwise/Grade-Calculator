package main;

import java.util.Scanner;

public class Student {
	int totalWam = 0;
	float totalGPA = 0;
	
	static float[] gradesArray;
	static int counter = 0;
	
	int numOfGrades;
	
	private final int CREDIT_POINT_NUM = 6;
	
	public Student(int numOfGrades) {
		this.numOfGrades = numOfGrades;
		gradesArray = new float[numOfGrades];
	}
	
	public void inputGrade() {
		//int[] tempGrades = {88, 78, 68, 45};
		int count = 0;
		int i = 0;
		
		do {
		//	gradesArray[i] = getStudentInput();
			i++;
			count++;
		}while(count < numOfGrades);
	}
	
	public void inputGradeTest(float grade) {
		if(counter < numOfGrades) {
			gradesArray[counter] = grade;
			counter++;
		}
	}
	
	public void resetGrades() {
		counter = 0;
		float[] newArray = new float[numOfGrades];
		gradesArray = newArray;
	}
	
	
	public int getTotalWAM() {
		int total = 0;
		for(int i =0; i < numOfGrades; i++) {
			total += gradesArray[i];
		}
		return total / numOfGrades;
	}
	
	public float getTotalGPA() {
		float totalPointsEarned = 0;
		int totalCreditPoints = CREDIT_POINT_NUM * numOfGrades;
		
		for(int i = 0; i < numOfGrades; i++) {			
			if(gradesArray[i] >= 80) {
				totalPointsEarned += 7.0 * CREDIT_POINT_NUM;
			}else if(gradesArray[i] >= 70) {
				totalPointsEarned += 6.0 * CREDIT_POINT_NUM;
			}else if(gradesArray[i] >= 60) {
				totalPointsEarned += 5.0 * CREDIT_POINT_NUM;
			}else if(gradesArray[i] >= 50) {
				totalPointsEarned += 4.0 * CREDIT_POINT_NUM;
			}else {
				totalPointsEarned += 0.0 * CREDIT_POINT_NUM;
			}
		}
		return totalPointsEarned / totalCreditPoints;
	}
	
	public void displayGrades() {
		for(int i =0; i < numOfGrades;i++) {
			System.out.println(gradesArray[i]);
		}
	}
	
	public void displayStudentGPA() {
		System.out.println("GPA: "+getTotalGPA());
	}
	
	public void displayStudentWAM() {
		System.out.println("WAM: "+getTotalWAM());
	}
	
}
