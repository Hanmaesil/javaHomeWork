package homework;

import java.util.Scanner;

public class Day03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//for(i = 1; num1 > num2 ? : num2실행 : num1실행)
		//while(
		
		
//		// 문제 1번 : 두 정수를 입력받아 최대공약수&최소공배수를 출력하시오.
//		
//		
		
		System.out.print("숫자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		int num2 = sc.nextInt();

		int b = num1 > num2 ? num2 : num1; // 두가지 숫자중 작은수 고르는 변수
		int divisor = 0;

		for (int i = 1; i <= b; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				divisor = i;
			}
		}
		System.out.println("최대공약수 : " + divisor);
		System.out.println("최소공배수 : " + (divisor * num1 / divisor * num2 / divisor));


		// 문제2번 : 1보다 큰 정수(N)를 입력하여 N!값을 구하시오.
		System.out.print("입력 : ");
		int num = sc.nextInt();

		int i = 0;
		int a = 1;

		for (i = 1; i < num; i++) {
			a *= i;
		}
		System.out.println(a);

	}

}
