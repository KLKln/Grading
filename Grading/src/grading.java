import java.util.ArrayList;
import java.util.Scanner;

public class grading {
	
	public static void main(String[] args) {
		
		String testName;
		int userNum;
		int testScore;
	
	Scanner input = new Scanner(System.in);	
	
	System.out.println("Please enter test takers name: ");
	testName = input.nextLine();
	
	System.out.print("How many tests would you like to enter? ");	
	userNum = input.nextInt();

	ArrayList<Integer> grades = new ArrayList<Integer>();
	
	for (int index = 0; index < userNum; index++)
	{
		System.out.println("Please enter test score number " + (index + 1) + ":");
		testScore = input.nextInt();
		grades.add(testScore);
	}
	System.out.println(testName);
	System.out.println("score" + "  ----  " + "letter grade");
	for(int i = 0; i < grades.size(); i++) {
		
		System.out.println(grades.get(i) + "  ----------  " + GradeBook.setLetterGrades(grades.get(i)));
	}
	
	input.close();
	


}

	
}