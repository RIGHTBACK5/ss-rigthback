package first;
import java.util.Scanner;
public class Snail {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�迭 �� �Է� : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int data[][] = new int[m][n];
		int c = 1, sw = 1, i = 0, j = -1, k = m, l = n;
		// i���� 0�� ������ ���࿡ ���� ����ϰ� �ٷ� �����࿡ ���� �� �� 3�� �������� �ϹǷ� ...
		while (true) {
			for (int p = 0; p < n; p++) { // ���� ���� ä���. �ݺ�
				j += sw; // �ּҸ� ��Ʈ�� �ѱ�� �ڵ�
				data[i][j] = c;
				c++;
			}
			n--;//���ư��� �ϱ� ���ؼ�
			if (m - 1 == 0 && l >= k) { // k�� ���� ���κ��� ���ΰ� ª�ų� ������ -1���� �ݺ��Ǵ� ��Ģ
				break; //���ΰ� ���κ��� ���� �� ���ΰ� -1����ŭ �ݺ��Ǵ� ��Ģ�� �̿��ؼ� �����
			}
			for (int p = 0; p < m - 1; p++) { // �࿡���� ä���.
				i += sw; // �ּҸ� ��Ʈ�� �������� �ϴ� �ڵ�
				data[i][j] = c;
				c++;
			}
			m--;
			sw *= -1;//sw�� ���̳ʽ��� �ٲٱ� ����
			if (n == 0 && l < k) // k�� ����
				break;
		}
		for (i = 0; i < k; i++) {
			for (j = 0; j < l; j++) {
				System.out.printf("%3d", data[i][j]);
			}
			System.out.println();
		}
	}
}
