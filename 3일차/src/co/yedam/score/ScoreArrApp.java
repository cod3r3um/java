package co.yedam.score;

public class ScoreArrApp {

	int a = 10;
	int[] arr = {90, 90, 50};
	
	void print() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	int total() {
		int result = 0;
		//for: 합계 계산
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	double avg() {
		double result = 0;
		result = total() / (double)arr.length;
		return result;		
	}
	void printH() {
		System.out.printf("%s \n국어:%-3d 영어:%-3d 수학:%-3d\n", "홍길동 성적", arr[0], arr[1], arr[2]);
	}
	
}
