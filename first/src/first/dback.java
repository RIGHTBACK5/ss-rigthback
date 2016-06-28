package first;

import java.util.Random;

public class dback {
	public static void main(String[] args) {

int [] numArray = new int [10]; 


for(int i = 0; i < numArray.length; i++ )
numArray[i] = (int)(Math.random()*100+1); // 1부터 100까지의 정수중 10개를 랜덤으로 대입


System.out.println("정렬전: "); 
for( int i = 0; i < numArray.length; i++ )
System.out.print(numArray[i] + " ");

System.out.println("\r\n");

System.out.println("오름차순 정렬: "); 

Arrays.sort(numArray); //sort 메소드를 이용해 배열을 오름차순 정렬

for( int i = 0; i < numArray.length; i++ ) //정렬된 배열을 출력
System.out.print(numArray[i] + " ");


System.out.println("\r\n");

System.out.println("내림차순 정렬: "); //내림차순 정렬인척 배열의 끝부터 루프를 돌면서 출력
for( int i = numArray.length-1; i >=0; i-- )
System.out.print(numArray[i] + " ");

}
};

