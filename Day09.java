package homework;

import java.util.Scanner;

public class Day09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1�� : ���� N�� �Է¹޾� N * N �迭�� ������ ���� ���ڸ� �����ϰ� ����Ͻÿ�.
//		System.out.print("���� N �Է� : ");
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

		// 2�� : �Ʒ��� ���� 2���� �迭�� �������� 180�� ȸ���Ͽ� ����Ͻÿ�.
//		System.out.println("����");
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
//		System.out.println("180�� ȸ��");
//		for (int i = 4; i >= 0; i--) {
//			for (int j = 4; j >= 0; j--) {
//				System.out.printf("%3d", ary[i][j]);
//			}
//			System.out.println();
//
//	}
		//3�� : 2���� �迭�� �Ʒ��� ���� ���̾Ƹ�����·� ����Ͻÿ�.
	      int n = 7;
	      int[][] arr = new int[n][n];
	      int num = 1; // 1~25
	      int start; // �� �࿡�� ó�� �����ϴ� ĭ
	      int count; // �� �࿡�� ��� ���ڸ� ����� ������

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
	      
	      // ����ڵ�
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