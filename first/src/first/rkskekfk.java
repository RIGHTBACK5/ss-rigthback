package first;
public class rkskekfk {
	  public static void main(String[] args) {
	       int A[][] = new int[4][4]; //1~5 ��� 
     int K=0; //������ ����
   int F=4; //�� ȸ������ ������ ����Ƚ���� ������ ����(5,4,3,2,1 �� �����)
     int C=1; //(+1)��� ���� ���� , (-1)��� ���� ����
    int I=1,J=0; 
	      while(true){         
	         for(int B=1;B<F;B++){ // ������ 1~5             
	    K=K+1;
	     J=J+C; //����� ����ȭ
	    A[I][J] = K;                                
	    }           
	    F=F-1;
        if(F>0){ 
      for(int B=1;B<F;B++){              
       K=K+1;
      I=I+C; //������ �ຯȭ
    
}
}
}