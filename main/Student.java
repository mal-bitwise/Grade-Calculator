package main;

import java.util.Scanner;

public class Student {
	int totalWam = 0;
	float totalGPA = 0;
	
	static float[] gradesArray;
	static int counter = 0;
	
	int numOfGrades;
	
	private final int CREDIT_POINT_NUM = 6;
	
	public Student() {
		gradesArray = new float[1];
	}
	
	
	public void inputGradeTest(float grade) {
		if(counter < gradesArray.length) {
			gradesArray[counter] = grade;
			counter++;
		}else {
			gradesArray = adjustArray(gradesArray);
			inputGradeTest(grade);
		}
	}
		
	public float[] adjustArray(float[] arr) {
		
		float[] newArr = new float[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		return newArr;
	}
	
	public void resetGrades() {
		counter = 0;
		
		float[] newArray = new float[1];
		gradesArray = newArray;
	}
	
	
	public int getTotalWAM() {
		int total = 0;
		for(int i =0; i < gradesArray.length; i++) {
			total += gradesArray[i];
		}
		return total / gradesArray.length;
	}
	
	public float getTotalGPA() {
		float totalPointsEarned = 0;
		int totalCreditPoints = CREDIT_POINT_NUM * gradesArray.length;
		
		for(int i = 0; i < gradesArray.length; i++) {			
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
		System.out.println("GRADES");
		for(int i =0; i < gradesArray.length;i++) {

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
