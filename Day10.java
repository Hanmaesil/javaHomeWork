package homework;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {

		// 문제 1번 : 정수 N을 입력받아 N * N 배열에 다음과 같이 숫자를 저장하고 출력하시오.
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 N입력 : ");
//		int num = sc.nextInt();
//		int[][] ary = new int[num][num];
//		int cnt = 1;
//
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary.length; j++) {
//				if (i % 2 == 0) {
//					ary[i][j] = cnt;
//					cnt++;
//				} else if (i % 2 == 1) {
//					for (j = ary.length -1; j >= 0; j--) {
//						ary[i][j] = cnt;
//						cnt++;
//					}if(j == -1)
//						break;
//				}
//			}
//		}
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary.length; j++) {
//				System.out.printf("%3d", ary[i][j]);
//			}
//			System.out.println();
//		}

		//2번 : 아래와 같은 2차원 배열을 왼쪽으로 90도 회전하여 출력하시오.

		System.out.println("원본");
		int[][] ary = new int[5][5];
		
		int cnt = 1;
		
		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary.length; j++) {
				ary[i][j] = cnt;
				cnt++;
			}
		}
		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary.length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}System.out.println();
		}
		
		System.out.println("90도 회전");
		for(int i = 4; i >= 0; i--) {
			for(int j = 0; j < ary.length; j++) {
				System.out.printf("%3d",ary[j][i]);
			}System.out.println();
		}
		
		
		//3번 : 모래시계
		//알파벳 순서대로 다음과 같이 모래시계 모양대로 출력하는
		//코드를 작성하여 출력하시오.

		
		
	}

}
