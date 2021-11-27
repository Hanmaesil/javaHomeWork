package homework;

import java.util.Scanner;

public class Day08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		// 1번 : 10진수를 입력받아 2진수로 변환하세요
//
//		// 2번5개의 정수를 입력 받아 오름차순 정렬하여 출력하는 프로그램을 구현하시오. (선택정렬)
//
//		int[] num = new int[5];
////		int[] num = { 9, 6, 7, 5, 3 }; //확인용
//
//		for(int i = 0; i < num.length; i++) {  //배열 입력받기.
//			System.out.print(i+1 + "번째 수 정렬 : ");
//			num[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < num.length; i++) { 
//			for (int j = 0; j < num.length; j++) {
//				if (num[i] < num[j]) { //하나씩 비교해보기, 부등호 기호가 바뀌면 차순이 바뀜.
//					int change = num[i]; // 바뀌기 전에 큰값을 따로 저장
//					num[i] = num[j]; // 큰값을 작은 값으로 바꿈
//					num[j] = change; // 작은 값 위치에 다시 큰값을 넣는다.
//				}
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
		//3번 : 5개의 정수를 입력 받아 버블정렬을 활용하여 오름차순 정렬하여 출력하는 프로그램을 구현하시오.
		//다시 한번 해보기... 너무 어려움 ㅠㅠㅠㅠ
		int[] num = {9,8,5,7,2};
//		int[] num = new int[5];
//		
//		for(int i = 0; i < num.length; i++) {
//			System.out.print(i+1 + "번째 수 입력 : ");
//			num[i] = sc.nextInt();
//		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length -1; j++) {
				if(num[i] < num[j]) {
					swap(num, i,j);
				}
			}
		}System.out.println("정렬 후");
		for(int i = 0; i < num.length; i++) {
			
			System.out.print(num[i] + " ");
		}
		
		
		
		
		
		

	}

	private static void swap(int[] num, int i, int j) {
		int change = num[i];
		num[i] = num[j];
		num[j] = change;
		
		
	}

}
