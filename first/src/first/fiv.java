package first;
import java.util.Scanner;
public class fiv {
public static void main(String[] args) {
Scanner buf = new Scanner(System.in);

int a[]= new int[5];
int b[]= new int [5];

int ans =0;

for(int i=0;i<5;i++ ){
   
   System.out.print(+(i+1)+"�� ����  :: ");
   a[i]=buf.nextInt();
   
}

   

System.out.println("�����Է� �Ϸ� ");
System.out.println();
for(int j = 0; j<5;j++){
   System.out.print(+(j+1)+"�� ������ �˷��ּ��� :: ");
   b[j] = buf.nextInt();
   if(a[j]==b[j]){
      ans++;
   }
   
}
System.out.println("���� Ƚ�� :: " +ans);


}



}

	

