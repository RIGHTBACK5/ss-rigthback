package first;
public class rkskekfk {
	  public static void main(String[] args) {
	       int A[][] = new int[4][4]; //1~5 사용 
     int K=0; //덜퍙이 숫자
   int F=4; //각 회전에서 수행할 수행횟수가 지정될 변수(5,4,3,2,1 로 변경됨)
     int C=1; //(+1)행과 열의 증가 , (-1)행과 열의 감소
    int I=1,J=0; 
	      while(true){         
	         for(int B=1;B<F;B++){ // 시작은 1~5             
	    K=K+1;
	     J=J+C; //행고정 열변화
	    A[I][J] = K;                                
	    }           
	    F=F-1;
        if(F>0){ 
      for(int B=1;B<F;B++){              
       K=K+1;
      I=I+C; //열고정 행변화
    
}
}
}