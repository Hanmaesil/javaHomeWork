package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Day13_2 {
	public static void main(String[] args) {

		// 문제 : 그림과 같이 대시(‘_’)문자로 구성된 형태의 숫자를
		// 주어진 숫자와 같이 출력하고 싶을때 사용되게 되는
		// 대시의 개수를 출력하는 프로그램을 작성하라

		Scanner sc = new Scanner(System.in);

		System.out.print("첫자리 0 을 제외한 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		transForm(num);

	}

	public static void transForm(int input) {
		int[] ary = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 }; //숫자를 대시 개수로 표현
		int a = 0; // 몫
		int b = 0; // 나머지
		int sum = 0; // 출력값

		while (true) {
			a = input / 10;
			b = input % 10;
			sum += ary[b];
			input = a; //몫을 다시 input값으로 넣어준다.
			if (a / 10 == 0) { // 종료 기준
				sum += ary[a]; // 마지막 몫을 더해준다.
				break;	
			}
			
		}
		System.out.println("대시(' - ')의 총합은 : " + sum);

	}

}
