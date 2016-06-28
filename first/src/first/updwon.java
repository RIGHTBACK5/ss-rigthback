package first;
import java.util.Random;
public class updwon {
public static void main(String[] args) {
int a []= new int [10];

	Random b = new Random();
	for (int g=0;g<a.length;g++){
		a[g]=b.nextInt(9)+1;
	}
	System.out.print("초기값:");
	for(int h=0;h<10;h++){
		System.out.print(a[h]);
	}
	System.out.println();
for(int c =0; c<a.length; c++){
	for(int d =c+1; d<a.length; d++){
		if(a[c]<a[d]){
			int e =a[c];
			a[c]=a[d];
			a[d] = e;
		}
	}
}
System.out.print("결과값:");
for(int f=0;f<10;f++){
	System.out.print(a[f]+"");
}
System.out.println();
}
}
