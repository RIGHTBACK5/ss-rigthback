package first;

import java.util.Random;

public class dback {
	public static void main(String[] args) {

int [] numArray = new int [10]; 


for(int i = 0; i < numArray.length; i++ )
numArray[i] = (int)(Math.random()*100+1); // 1���� 100������ ������ 10���� �������� ����


System.out.println("������: "); 
for( int i = 0; i < numArray.length; i++ )
System.out.print(numArray[i] + " ");

System.out.println("\r\n");

System.out.println("�������� ����: "); 

Arrays.sort(numArray); //sort �޼ҵ带 �̿��� �迭�� �������� ����

for( int i = 0; i < numArray.length; i++ ) //���ĵ� �迭�� ���
System.out.print(numArray[i] + " ");


System.out.println("\r\n");

System.out.println("�������� ����: "); //�������� ������ô �迭�� ������ ������ ���鼭 ���
for( int i = numArray.length-1; i >=0; i-- )
System.out.print(numArray[i] + " ");

}
};

