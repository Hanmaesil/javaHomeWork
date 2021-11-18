package homework;

import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 1번 : 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력하시오. System.out.print("정수 입력 : ");
		 * 
		 * int num = sc.nextInt(); int beforeR = num; int afterR = num/10 *10 + 10;
		 * 
		 * 
		 * System.out.println("반올림 전 값 : " + beforeR); if(num%10 >= 5) {
		 * System.out.println("반올림 후 값 : " + afterR); }else {
		 * System.out.println("반올림 후 값 : " + num/10 * 10); }
		 */

		/*
		 * 2번 : 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하시오. 단, 최대단위는 10000원, 최소단위는
		 * 100원
		 * 
		 * System.out.print("현재 금액 : "); int money = sc.nextInt(); int tenThounsandWon =
		 * money/10000; int fiveThousandWon = (money%10000)/5000; int thousandWon =
		 * ((money%10000)%1000)/1000; int fiveHundredWon =
		 * (((money%10000)%1000)&1000)/500; int oneHundredWon =
		 * ((((money%10000)%1000)&1000)%500)/100;
		 * 
		 * if(money <= 10000 && money >= 100) { System.out.println("잔돈변환");
		 * System.out.println("10000원 : " + tenThounsandWon + "개");
		 * System.out.println("5000원 : " + fiveThousandWon + "개");
		 * System.out.println("1000원 : " + tenThounsandWon + "개");
		 * System.out.println("500원 : " + fiveHundredWon + "개");
		 * System.out.println("100원 : " + oneHundredWon + "개");
		 * }System.out.println("다시 입력하세요.");
		 */

		/*
		 * 3번 : 윤년을 구하는 프로그램을 작성하시오.
		 * 
		 * 윤년이란 2월에 29일이 있는 날을 말한다. 4의 배수이면서 100의 배수가 아닐 때는 윤년이다. 400의 배수일 때 윤년이다.
		 * 
		 * System.out.print("년도 입력 : "); int year = sc.nextInt();
		 * 
		 * if(year%4 == 0 && year%100 != 0) { System.out.println("윤년."); }else
		 * if(year%400 == 0) { System.out.println("윤년."); }else {
		 * System.out.println("윤년 아님."); }
		 */

		/*
		 * 4번 : (세 자리 수) * (세 자리 수)는 다음과 같이 계산된다. (1), (2)번을 입력 받아 결과 화면처럼 (3), (4),
		 * (5), (6)번을 출력하는 프로그램을 작성하시오
		 * 
		 * System.out.print("첫 번째 숫자 입력 : "); int num1 = sc.nextInt();
		 * System.out.print("두 번째 숫자 입력 : "); int num2 = sc.nextInt(); int num3 =
		 * (num2%100)%10 * num1; int num4 = num2%100/10 * num1; int num5 = num2/100 *
		 * num1; int sum = num1 * num2;
		 * 
		 * System.out.println(num3); System.out.println(num4); System.out.println(num5);
		 * System.out.println(sum);
		 */

	}

}
