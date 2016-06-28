package first;
import java.util.Scanner;





public class nin {

 public static void main(String[] args) {

 

  Scanner sc = new Scanner(System.in);

  System.out.print("원하는 행수 입력 : ");

  int N = sc.nextInt();

  

  int[][] num = new int[N][N];

  int i,j,k=0;

  int count=1;

 

  for(k=0;k<=N/2;k++){

   for(j=0;j<N;j++){

    if(j%4==0){

     for(i=0;i<N;i++){

      if(num[k][i]==0){

       num[k][i]=count;

       count++;   

      }  

     }

    }

    if(j%4==1){

     for(i=j;i<N;i++){

      if(num[i][N-1-k]==0){

       num[i][N-1-k]=count;

       count++;   

      }  

     }

    }

    if(j%4==2){

     for(i=N-1;i>=0;i--){

      if(num[N-1-k][i]==0){

       num[N-1-k][i]=count;

       count++;

      }

     }

    }

    if(j%4==3){

     for(i=N-1;i>=0;i--){

      if(num[i][k]==0){

       num[i][k]=count;

       count++;

      }

     }

    }

   }

  }

 

  for(i=0;i<N;i++){ 

   for(j=0;j<N;j++){

    System.out.print(num[i][j]+"\t");

   }

   System.out.println();

  }

 

 }

}