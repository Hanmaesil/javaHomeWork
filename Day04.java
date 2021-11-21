package homework;

import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//문제 1번 : 소인수 분해를 해주는 프로그램을 작성하시오.

		System.out.print("소인수분해를 할 수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print(num + " = ");
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				num = num / i;
				System.out.print(i);
				i=1;
			if(num  != i) {
				System.out.print("*");	
			}
				

		}

		// 문제 2번 : A,B 숫자를 입력 받는다.
		// A-B를 출력한다.
		// A와 B가 모두 0을 입력 받으면 프로그램이 종료된다.

//		int a = 0;
//		int b = 1;
//		int result = a - b;
//
//		while (true) {
//			System.out.print("A입력 : ");
//			a = sc.nextInt();
//			System.out.print("B입력 : ");
//			b = sc.nextInt();
//			System.out.println("결과 : " + result);
//
//			if (a == 0 && b == 0)
//				break;
//		}System.out.println("종료");
//	}

	}
	}
}
