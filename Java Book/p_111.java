import java.util.Scanner;

public class p_111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//7�� : �簢���� (100,100)�� (200,200)�� �������� �̷�����ִ�.
//		// ���� x �� y �� �Է¹޾� ���簢�� �ȿ� �ִ��� �Ǻ��Ͻÿ�.
//		
//		int x1 = 100;
//		int x2 = 200;
//		
//		int y1 = 100;
//		int y2 = 200;
//		
//		System.out.printf("�簢���� (%d,%d) (%d,%d) �� �������� �̷���� �ִ�.%n",x1,y1,x2,y2);
//		//printf : %d - ����, %s - ���ڿ� , %n -  �ٹٲ�
//		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� : ");
//		int inputX = sc.nextInt();
//		int inputY = sc.nextInt();
//		
//		
//		if(inputX>=  100 && inputX<=200 && inputY >=100 && inputY <=200) {
//			System.out.printf("(%d, %d)�� �簢�� �ȿ� �ֽ��ϴ�.",inputX, inputY);
//		}else
//			System.out.printf("(%d, %d)�� �簢�� �ȿ� �����ϴ�.",inputX, inputY);
		
		//8�� �ٽ�Ǯ���.
//		public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
//			if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
//				return true;
//			else return false;
//		}
		
		//9�� ���� �߽��� ��Ÿ���� �� ���� �������� �Ǽ� ������ �Է¹޾ƶ�
		// �׸��� �Ǽ� ������ �ٸ��� (x,y)�� �Է¹޾� �� ���� ���ο� �ִ��� �Ǻ��Ͽ� ����϶�
		// ���� ������ : (
		System.out.print("���� �߽ɰ� ������ �Է� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double r = sc.nextDouble();
		

		
		System.out.print("�� �Է� : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double dis = Math.sqrt((x-a) * (x-a) + ( y-b) * (y-b)); // Math.sqrt() : ������ ex) Math.sart(4) = 2
		
		if(dis < r) {
			System.out.printf("�� (%.1f , %.1f) �� �� �ȿ� �ִ�.",x,y);
		}else
			System.out.printf("�� (%.1f , %.1f) �� �� �ȿ� ����..",x,y);
			
		
		
		
		
		
		
	}

}
