package homework;

import java.util.Scanner;

public class Day09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1번 : 정수 N을 입력받아 N * N 배열에 다음과 같이 숫자를 저장하고 출력하시오.
//		System.out.print("정수 N 입력 : ");
//		int num = sc.nextInt();
//		int[][] ary = new int[num][num];
//		
//		for(int i = 0; i < ary.length; i++) {
//			for(int j = 0; j < ary.length; j++) {
//				ary[i][j] = (j * 5) + (i + 1);
//			}
//		}
//		for(int i = 0; i < ary.length; i++) {
//			for(int j = 0; j < ary.length; j++) {
//				System.out.print(ary[i][j] + " ");
//			}System.out.println();
//		}

		// 2번 : 아래와 같은 2차원 배열을 왼쪽으로 180도 회전하여 출력하시오.
//		System.out.println("원본");
//
//		int[][] ary = new int[5][5];
//		int num = 1;
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary.length; j++) {
//				ary[i][j] = num;
//				num += 1;
//
//			}
//		}
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary.length; j++) {
//				System.out.printf("%3d", ary[i][j]);
//			}
//			System.out.println();
//
//		}
//		
//		System.out.println("180도 회전");
//		for (int i = 4; i >= 0; i--) {
//			for (int j = 4; j >= 0; j--) {
//				System.out.printf("%3d", ary[i][j]);
//			}
//			System.out.println();
//
//	}
		//3번 : 2차원 배열에 아래와 같이 다이아몬드형태로 출력하시오.
	      int n = 7;
	      int[][] arr = new int[n][n];
	      int num = 1; // 1~25
	      int start; // 각 행에서 처음 시작하는 칸
	      int count; // 각 행에서 몇개의 숫자를 출력할 것인지

	      for(int i = 0 ; i < n ; i++)
	      {
	         
	         if(i <= n/2) 
	            start = n/2-i; // 3-i
	         
	         else 
	            start = i-(n/2); // i-3
	         
	         // start = Math.abs(n/2-i);
	         
	         count = 7 - (start*2);
	         for(int j = 0 ; j < count ; j++)
	         {
	            arr[i][start+j] = num;
	            num++;
	         }
	      }
	      
	      // 출력코드
	      for(int i = 0 ; i < n ; i++)
	      {

	         for(int j = 0 ; j < n ; j++)
	         {
	            System.out.print(arr[i][j] + (arr[i][j]>9?" ":"  "));
	         }
	         System.out.println();
	      }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}