package co.yedam.numgame;
/*
숫자 맞추기 게임
작성자: 진아름
 */
public class NumberGameApp {
	//컴퓨터가 임의의 수 생성
	int com;	//컴퓨터가 만든 수
	int user; 	//사용자가 입력한 값
	
	//난수(1~10)
	void init() {
	}
			
	//사용자가 수를 입력
	void input() {
		//scanner 를 이용해서 정수값 입력
	}
	
	//높다와 낮다: false 맞다: true 로 구분
	boolean confirm() {
		//com과 user를 비교해서 같으면 true 리턴
		//다르면 높다/낮다 출력 후 false 리턴
	}
	
	void start() {
		while(true) {
			input();
			if(confirm()) {
				break;
			}
		}
	}
}
