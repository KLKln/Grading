
public class GradeBook {
	
	private String testName = "";
	private int testScore = 0;
	private static String letterGrade = "";
	
	public GradeBook() {
		//testName = "";
		//testScore = 0;
		//letterGrade = "";
	}
	

	public String getTestName() {
		return testName;
	}



	public void setTestName(String testName) {
		this.testName = testName;
	}



	public int getTestScore() {
		return testScore;
	}



	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}



	public static String getLetterGrade() {
		return letterGrade;
	}



	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}



	public GradeBook(String testName, int testScore, String letterGrade) {
		super();
		this.testName = testName;
		this.testScore = testScore;
		this.letterGrade = letterGrade;
	}
	
	public static String setLetterGrades(int testScore) {
		String letterGrade;
		if (testScore < 60) {
			letterGrade = "F";
		}
		else if (testScore < 70) {
			letterGrade = "D";
		}
		else if (testScore < 80) {
			letterGrade = "C";
		}
		else if (testScore < 90) {
			letterGrade = "B";
		}
		else {
			letterGrade = "A";
		}
		return letterGrade;
	
	
	

}
}
