package first;
import java.util.Random;
import java.util.Scanner;
public class four { 
	   public static void main(String[] args) {
	      int iw = 0, cw = 0;
	      int mm = 0;
	      int t=0,l=0,e=0;//�̱�Ƚ��,��Ƚ��,���º�

	      Scanner sc = new Scanner(System.in);
	      Random rd = new Random();

	      String rsp[] = { "����", "����", "��" };
	      // a= �Է¹��� ��

	      for (int i = 0; i < 10; i++) {
	         int b = rd.nextInt(3);
	         String a = sc.nextLine();
	         switch (a) {
	         case "����":
	            mm = 0;
	            break;
	         }
	         for (int j = 0; j < 3; j++) {
	             if (b == j) {
	                System.out.println(rsp[j]);
	             }
	          }
	          if (mm < b)
	             if (mm == 0 && b == 2) {
	                System.out.println("��");
	                w++;
	             } else {
	                System.out.println("��");
	                r++;
	             }
	          if (mm > b) {
	             if (mm == 2 && b == 0) {
	                System.out.println("��");
	                r++;
	             } else {
	                System.out.println("��");
	                w++;
	             }
	          }
	          if (mm == b){
	             System.out.println("���º�");
	          e++;}
	       }
	       System.out.println(w+"��"+r+"��"+e+"��");
	       System.out.println("�·�"+(10*t)+"%");
	       System.out.println();
	    }
	 }