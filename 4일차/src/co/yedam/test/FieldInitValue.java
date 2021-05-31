package co.yedam.test;
/*
기본 데이터형 8타입은 기본값은 0으로 초기화
참조변수 (String, [])의 초기값은 null
 */

import java.util.Arrays;

public class FieldInitValue {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	char c;
	String str;
	int[] arr;
	
	//int와 double을 초기화 시키는 생성자
	FieldInitValue(){
	}
	FieldInitValue(int x, double y){
		i = x;
		d = y;
	}
	
	
	
	@Override
	public String toString() {
		return "FeildInitValue [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", bool="
				+ bool + ", c=" + c + ", str=" + str + ", arr=" + Arrays.toString(arr) + "]";
	}
	
}
