package homework;

import java.util.Scanner;

public class Day05 {

	public static void main(String[] args) {
		// 문제 1번 : 정수 n을 입력받아 1, 2, 4, 7, 11 과 같은 수열의 n번째 항까지 출력하시오.

//		System.out.println(1);
//		System.out.println(1+1);
//		System.out.println(1+1+2);
//		System.out.println(1+1+2+3);

		Scanner sc = new Scanner(System.in);

//		System.out.print("n 입력 : ");
//		int num = sc.nextInt();
//		int j = 1;
//		
////		1부터 시작해서 1을 더하면 2가 되는데 2에 다시 2를 더하는 방식
//		for(int i = 0; i < num; i++) { //i가 num값보다 작으면 true
//			j =  j +  i;				// j가 계속 누적되는 값. 1로 시작해서 i가 증가하면서 증가값이 계속 j값이 된다.
//			System.out.print(j + " "); // j값이 나올때마다 나란히 출력

		// 2번 : 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
		// 별 찍기 ㅡㅡ
//		for (int j = 1; j <= 5; j++) {
//			for (int i = 1; i <= j; i++) {
//				System.out.print("*");
//			}System.out.println();
//		}

		// 역으로 별찍기
//		for (int j = 5; j >= 0; j--) {
//			for (int i = 1; i <= j; i++) {
//				System.out.print("*");
//			}System.out.println("");
//		}

		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (num = 7; num >= 0; num--) {
			for (int i = 1; i <= num; i++) {
				System.out.print("*");
			}System.out.println("");
		}

	}

}
