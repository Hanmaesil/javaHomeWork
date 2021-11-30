package homework;

import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {

		/*
		 * 1번 :두 개의 정수를 매개변수로 받아 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드 isDivide( ) 를 작성하세요. 이때,
		 * 나누어지면 true, 나누어지지 않으면 false을 반환함.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);

	}

	public static boolean isDivide(int num1, int num2) {
		return num1 % num2 == 0;

	}

}
