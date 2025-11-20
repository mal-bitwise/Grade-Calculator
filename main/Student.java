package main;

public class Student {
	
	int semesterNum = 1;
	int totalWam = 0;
	float totalGPA = 0;
	
	int tempWam = 0;
	int tempGPA = 0;
	
	int[] gradesArray;
	
	int numOfGrades;
	
	final int CREDIT_POINT_NUM = 6;
	
	public Student(int size) {
		this.numOfGrades = size;
		gradesArray = new int[size];
	}
	
	public void inputGrades() {
		int[] tempGrades = {88, 78, 68, 45};
		int count = 0;
		int i = 0;
		
		do {
			count++;
			
			gradesArray[i] = tempGrades[i];
			i++;	
		}while(count < numOfGrades);
	}
	
	public void displayArray() {
		for(int i =0; i < numOfGrades;i++) {
			System.out.println(gradesArray[i]);
		}
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
}
