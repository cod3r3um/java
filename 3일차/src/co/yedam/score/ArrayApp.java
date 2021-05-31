package co.yedam.score;

//1.클래스 설계도(uml)
//2.클래스 선언
//3.new객체 생성
//4.객체 이용(메서드 호출)

public class ArrayApp {
	
	int[] arr = new int[10];//0~9 10개 담겠다 선언(변경불가)
	
	//배열에 초기값 지정
	void init() {
		for (int i=0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
	}

	void print() {
		for (int i=0; i < arr.length; i++) {
			 System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	void total() {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];			
		}
		System.out.println("합계=" + result);
		System.out.println();
	}
	void max() {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값=" + max);
	}

	public static void main(String[] args) {
		ArrayApp app = new ArrayApp();
		app.init();
		app.total();
		app.max();
		app.print();
		
	}
	
}
