package homework;

import java.util.Random;
import java.util.Scanner;

public class Day07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// 1번 : N과 X를 입력 받는다.
		// N개의 정수를 입력 받는다.
		// N개의 숫자 중 X보다 작은 수만 출력 한다.

//		System.out.print("N 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("X 입력 : ");
//		int num2 = sc.nextInt();
//
//		int[] ary = new int[num1];
//
//		for (int i = 0; i < num1; i++) {
//			System.out.print(i + 1 + "번째 정수 입력 : ");
//			int j = sc.nextInt();
//			ary[i] = j;
//		}
//		System.out.print("결과 : ");
//		for (int i = 0; i < ary.length; i++) {
//			if (ary[i] < num2) {
//				System.out.print(ary[i] + " ");
//			}
//		}

//		int max = ary[0];
//		int min = ary[0];
//
//		for(int i = 0; i < num1; i++) {
//			if(ary[i] < min) {
//				min = ary[i];
//			}
//		}
//		
//		System.out.println(ary[5]);
//		System.out.println(min);

		// 2번 : 아래와 같이 1차원의 점들이 주어졌을 때,
		// 그 중 가장 거리가 짧은 점(index)들을 출력하시오.
		// (단, 점들 사이의 거리는 모두 다르다)
		
		
		
		int[] point = {92,32,52,9,81,2,68};
		int result = 0;
		
		for(int i = 0; i < point.length; i++) {
			for(int j = 0; j < i; j++) {
				if(point[i] - point[j] >= 1) {
					result = point[i] - point[j]; 
				}
			}
		}
		int min = point[0];
		
		for(int i = 0; i < point.length; i++) {
			for(int j = 0; j <i; j++) {
				if(point[i] < min) {
					point[i] = min;
				}
			}
		}
		System.out.println(min);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		

	}

}
