package homework;

import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 1�� : ������ �Է¹޾� 1�� �ڸ����� �ݿø� �� ����� ����Ͻÿ�. System.out.print("���� �Է� : ");
		 * 
		 * int num = sc.nextInt(); int beforeR = num; int afterR = num/10 *10 + 10;
		 * 
		 * 
		 * System.out.println("�ݿø� �� �� : " + beforeR); if(num%10 >= 5) {
		 * System.out.println("�ݿø� �� �� : " + afterR); }else {
		 * System.out.println("�ݿø� �� �� : " + num/10 * 10); }
		 */

		/*
		 * 2�� : �Ž������� �Է� �޾� ������� �ϴ� ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ִ������ 10000��, �ּҴ�����
		 * 100��
		 * 
		 * System.out.print("���� �ݾ� : "); int money = sc.nextInt(); int tenThounsandWon =
		 * money/10000; int fiveThousandWon = (money%10000)/5000; int thousandWon =
		 * ((money%10000)%1000)/1000; int fiveHundredWon =
		 * (((money%10000)%1000)&1000)/500; int oneHundredWon =
		 * ((((money%10000)%1000)&1000)%500)/100;
		 * 
		 * if(money <= 10000 && money >= 100) { System.out.println("�ܵ���ȯ");
		 * System.out.println("10000�� : " + tenThounsandWon + "��");
		 * System.out.println("5000�� : " + fiveThousandWon + "��");
		 * System.out.println("1000�� : " + tenThounsandWon + "��");
		 * System.out.println("500�� : " + fiveHundredWon + "��");
		 * System.out.println("100�� : " + oneHundredWon + "��");
		 * }System.out.println("�ٽ� �Է��ϼ���.");
		 */

		/*
		 * 3�� : ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �����̶� 2���� 29���� �ִ� ���� ���Ѵ�. 4�� ����̸鼭 100�� ����� �ƴ� ���� �����̴�. 400�� ����� �� �����̴�.
		 * 
		 * System.out.print("�⵵ �Է� : "); int year = sc.nextInt();
		 * 
		 * if(year%4 == 0 && year%100 != 0) { System.out.println("����."); }else
		 * if(year%400 == 0) { System.out.println("����."); }else {
		 * System.out.println("���� �ƴ�."); }
		 */

		/*
		 * 4�� : (�� �ڸ� ��) * (�� �ڸ� ��)�� ������ ���� ���ȴ�. (1), (2)���� �Է� �޾� ��� ȭ��ó�� (3), (4),
		 * (5), (6)���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 * 
		 * System.out.print("ù ��° ���� �Է� : "); int num1 = sc.nextInt();
		 * System.out.print("�� ��° ���� �Է� : "); int num2 = sc.nextInt(); int num3 =
		 * (num2%100)%10 * num1; int num4 = num2%100/10 * num1; int num5 = num2/100 *
		 * num1; int sum = num1 * num2;
		 * 
		 * System.out.println(num3); System.out.println(num4); System.out.println(num5);
		 * System.out.println(sum);
		 */

	}

}
