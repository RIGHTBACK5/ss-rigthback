package first;
import java.util.Scanner;
import java.util.Random;
public class wprnldl {
	   public static void main(String[] args) {
	      int com = 0;
		   int me = 0;
		   int w = 0;
		    int l = 0;
		    int s = 0;
		    int g = 0;
		   Scanner sc  = new Scanner(System.in);
	      Random rd = new Random();	      
System.out.println("가위바위보 시작");
System.out.println("당신의 한수는?");
String a[] = {"가위","바위","보"};
while(g<10){
	com = rd.nextInt(3);
String c = sc.nextLine();

switch(c){
case "가위":
	if (com==1){
		System.out.println("비김");
		s++;g++;}
	else if (com==2){
		System.out.println("패배");
		l++;g++;}
	else if (com==3){
		System.out.println("승리!");
		w++;g++;}
	break;
case "바위":
	if (com==1){
		System.out.println("승리!");
		w++;g++;}
	else if (com==2){
		System.out.println("비김");
		s++;g++;}
	else if (com==3){
		System.out.println("패배");
		l++;g++;}
	break;
case "보":
	if (com==1){
		System.out.println("패배");
		l++;g++;}
	else if (com==2){
		System.out.println("승리!");
		w++;g++;}
	else if (com==3){
		System.out.println("비김");
		 s++;g++;}
	break;
	default : 
		System.out.println("오타");
		break;}
if(com == 1){
	System.out.println("컴은 가위");}
if(com == 2){
	System.out.println("컴은 바위");}
if(com == 3){
	System.out.println("컴은 보");}

}
System.out.println(w+"승"+l+"패"+s+"무  승률"+(10*w)+"%");

}
}
	   

   