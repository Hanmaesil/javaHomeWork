package homework;

import java.util.Random;

public class Day11_1 {

	public static void main(String[] args) {

		// 문제 : num1, num2, op (+, -, *, /) 를 매개변수로 받아 num1과 num2를 op에 맞게 연산한 결과값을
		// 반환해주는 cal 메소드를 작성하세요.

		Random ran = new Random();
		int num1 = ran.nextInt(10) + 1;
		int num2 = ran.nextInt(10) + 1;
		

		System.out.println("첫번째 랜덤 숫자 : " + num1);
		System.out.println("두번째 랜덤 숫자 : " + num2);

		int result = cal(num1, num2);

	}
	
	public static int cal(int num1, int num2) {
		
		
		return -1;
	}
	
	
	
	
}
