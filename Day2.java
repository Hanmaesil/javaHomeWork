package homework;

public class Day2 {

	public static void main(String[] args) {
		// 1번 : 1-2+3-4+…+99-100 를 계산하여 답을 출력하시오.
		// if문, for문 한번씩 사용.
//		int num = 1;
//		int sum = 0;
//				
//		while(true) {
//			if(num%2 == 1) {
//				System.out.print(num + " ");
//				num++;
//				sum = sum + num;
//			}else {
//				System.out.print(num * -1 + " ");
//				num++;
//				sum = sum - num;
//			}if(num > 100) {
//				break;
//			}
//		}
//		
//		System.out.println("\n결과 : "  + sum);

		// 1번 for문 사용하기.

//		int sum = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i%2 == 1) {
//				System.out.print(i + " ");
//				sum = sum + i;
//			}else{
//				System.out.print(i*-1 + " ");
//				sum = sum - i;
//			}
//		}System.out.println("\n합계 : " + sum);

		// 2번 : (77*1) + (76*2) + (75*3)+…+(1*77)를 계산하여 결과를 출력하시오.

//		int a = 0;
//		int b = 1;
//		
//		int c = 0;
//		int d = 0;
//		
//		for (a = 77; a > 0; --a) {
//			c = a * b;
//			b++;
//			d = d + c; 
//		}System.out.println(d);
		

	}
}
