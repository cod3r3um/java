package co.yedam.exam;

public class ExamScoreExample {
	public static void main(String[] args) {
		ExamScore examScore = new ExamScore("1234", 90, 90, 90);
		System.out.println(examScore.isPass()?"합격":"불합격");
	}

}
