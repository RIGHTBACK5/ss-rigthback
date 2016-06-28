package first;
import java.util.Scanner;
public class sdaafsf {
public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.println(method1());//학교의 학생(개체들) 객체를 담는 반이 메소드
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
