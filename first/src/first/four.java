package first;
import java.util.Random;
import java.util.Scanner;
public class four { 
	   public static void main(String[] args) {
	      int iw = 0, cw = 0;
	      int mm = 0;
	      int t=0,l=0,e=0;//ÀÌ±äÈ½¼ö,ÁøÈ½¼ö,¹«½ÂºÎ

	      Scanner sc = new Scanner(System.in);
	      Random rd = new Random();

	      String rsp[] = { "°¡À§", "¹ÙÀ§", "º¸" };
	      // a= ÀÔ·Â¹ÞÀº °ª

	      for (int i = 0; i < 10; i++) {
	         int b = rd.nextInt(3);
	         String a = sc.nextLine();
	         switch (a) {
	         case "°¡À§":
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
	                System.out.println("½Â");
	                w++;
	             } else {
	                System.out.println("ÆÐ");
	                r++;
	             }
	          if (mm > b) {
	             if (mm == 2 && b == 0) {
	                System.out.println("ÆÐ");
	                r++;
	             } else {
	                System.out.println("½Â");
	                w++;
	             }
	          }
	          if (mm == b){
	             System.out.println("¹«½ÂºÎ");
	          e++;}
	       }
	       System.out.println(w+"½Â"+r+"ÆÐ"+e+"¹«");
	       System.out.println("½Â·ü"+(10*t)+"%");
	       System.out.println();
	    }
	 }