import java.util.Scanner;

public class p_112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���� 10�� : ���� ������ �ΰ� �ް�, �� ���� ���� ��ġ���� �Ǵ��Ͽ� ����϶�
		
		System.out.print("ù��° ���� �߽ɰ� �������� �Է� : ");
		double cricle1x = sc.nextDouble();
		double cricle1y = sc.nextDouble();
		double cricle1r = sc.nextDouble();
		
		
		
		System.out.print("�ι�° ���� �߽ɰ� �������� �Է� : ");
		double cricle2x = sc.nextDouble();
		double cricle2y = sc.nextDouble();
		double cricle2r = sc.nextDouble();
		
		double centerDis = 0; // �� �������� ���� ���ϴ� ��(�� �������� ���̿� �� �������� �հ� ���̸� ���ؼ� ��ġ�� ������ �˼��ִ�.)
		double sum = cricle1r + cricle2r; //�� �������� ��
		double minus = Math.abs(cricle1r - cricle2r); // �� �������� ��
		
		if(cricle1x > cricle2x) {
			centerDis = cricle1x - cricle2x;
		}else
			centerDis = cricle2x - cricle1x;
		
		if(minus < centerDis && centerDis < sum) {
			System.out.println("�� ���� ���� ��ģ��.");
		}else if(sum == centerDis){
			System.out.println("�� ���� ���� ��ģ��.");
		}else if(minus == centerDis) {
			System.out.println("�� ���� ���� ��ģ��.");
		}else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		
		//���� Ǫ�¹� : �ΰ��� �������� �պ��� ������ ���� ��ģ�� ->>���ذ� �ȵ� �Ф�
		//distance = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));

		
		
		
	}

}
