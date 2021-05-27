package co.yedam.app.score;

public class AppMain {

	public static void main(String[] args) {
		ScoreApp score = new ScoreApp();
		
		//성적 입력
		score.input();
		
		//결과 출력
		System.out.println("총점 " + score.getSum() + "/" +
						   "평균 " + score.getAvg() + "/" +
						   "등급 " + score.getGrade());
		System.out.println("합격 여부: " + (score.isPass()? "합격" : "불합격"));
	}
}
