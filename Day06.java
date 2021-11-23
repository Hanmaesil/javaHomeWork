package homework;

import java.util.Random;

public class Day06 {

	public static void main(String[] args) {
		
		//1번 : 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후 가장 큰 수와 작은 수를 각각 출력하시오.
		
		Random ran = new Random();
		int[] array = new int[8];
		
		System.out.print("배열에 있는 모든 값 : ");
		for(int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			for(int j = 0; j < i; j++)
				if(array[i] == array[j]) { 
					i = i-1;
				}
				
		}
		//syso(배열 출력하기)
		
		//2번 : 중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오
		
//		int[] array1 = new int[6];
//		
//		for(int i = 0; i < array1.length; i++) {
//			int num = ran.nextInt(45)+1;
//			System.out.println("행운의 숫자 : " + num);
//			array1[i] = num;
//			for(int j = 0; j < 6; j++)
//			if(array1[i] == array1[j]){ 
//				int num1 = ran.nextInt(45) + 1;
//				array1[i] = num1;
//				j = j -1;
//			}
//		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
