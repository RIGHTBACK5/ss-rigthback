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
System.out.println("���������� ����");
System.out.println("����� �Ѽ���?");
String a[] = {"����","����","��"};
while(g<10){
	com = rd.nextInt(3);
String c = sc.nextLine();

switch(c){
case "����":
	if (com==1){
		System.out.println("���");
		s++;g++;}
	else if (com==2){
		System.out.println("�й�");
		l++;g++;}
	else if (com==3){
		System.out.println("�¸�!");
		w++;g++;}
	break;
case "����":
	if (com==1){
		System.out.println("�¸�!");
		w++;g++;}
	else if (com==2){
		System.out.println("���");
		s++;g++;}
	else if (com==3){
		System.out.println("�й�");
		l++;g++;}
	break;
case "��":
	if (com==1){
		System.out.println("�й�");
		l++;g++;}
	else if (com==2){
		System.out.println("�¸�!");
		w++;g++;}
	else if (com==3){
		System.out.println("���");
		 s++;g++;}
	break;
	default : 
		System.out.println("��Ÿ");
		break;}
if(com == 1){
	System.out.println("���� ����");}
if(com == 2){
	System.out.println("���� ����");}
if(com == 3){
	System.out.println("���� ��");}

}
System.out.println(w+"��"+l+"��"+s+"��  �·�"+(10*w)+"%");

}
}
	   

   