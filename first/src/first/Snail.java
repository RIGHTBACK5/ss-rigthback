package first;
import java.util.Scanner;
public class Snail {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("배열 수 입력 : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int data[][] = new int[m][n];
		int c = 1, sw = 1, i = 0, j = -1, k = m, l = n;
		// i값이 0인 이유는 한행에 값을 출력하고 바로 다음행에 값이 들어갈 때 3번 움직여야 하므로 ...
		while (true) {
			for (int p = 0; p < n; p++) { // 열에 값을 채운다. 반복
				j += sw; // 주소를 컨트롤 넘기는 코드
				data[i][j] = c;
				c++;
			}
			n--;//돌아가게 하기 위해서
			if (m - 1 == 0 && l >= k) { // k값 감소 가로보다 세로가 짧거나 같으면 -1번만 반복되는 규칙
				break; //가로가 세로보다 작을 때 가로가 -1번만큼 반복되는 규칙을 이용해서 멈춘다
			}
			for (int p = 0; p < m - 1; p++) { // 행에값을 채운다.
				i += sw; // 주소를 컨트롤 내려가게 하는 코드
				data[i][j] = c;
				c++;
			}
			m--;
			sw *= -1;//sw를 마이너스로 바꾸기 위해
			if (n == 0 && l < k) // k값 감소
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
