package homework;

public class Day13_1 {

	public static void main(String[] args) {

		// ���� : startValue���� endValue������ ���� �� ��������
		// ����ϴ� getPerfectNumber()�޼ҵ带 �����ϼ���.

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int start, int end) {
		int sum = 0;
		System.out.print("2~1000������ ������ : ");
		for (int i = start; i <= end; i++) {
			sum=0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}

		}
	}

}
