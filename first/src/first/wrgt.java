package first;

public class wrgt {
	public static void main(String[] args) {
		int fac = 5;
		System.out.println(method1(fac));//�б��� �л�(��ü��) ��ü�� ��� ���� �޼ҵ�
	}

	public static int method1(int num) {
		if (num <= 1)
			return num;
		else
		{
			return method1(num-1) * num;
		}
	}

}
