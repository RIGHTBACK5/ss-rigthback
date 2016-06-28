package first;

public class sec {
	public static void main(String[] args) {
		for (int i = 3; i>=1; i --)
		{

			for(int j = 1; j<=7; j ++)
			{
			if(j+i<5||j-i>=4)
			System.out.print(" ");
			else
				System.out.print("*");	
			 }// 별증가1
			 System.out.println();
		}
		for (int i = 1; i<=3; i ++)
		{

			for(int j = 1; j<=7; j ++)
			{
			if(j+i<5||j-i>=4)
			System.out.print(" ");
			else
				System.out.print("*");	
			}// 별증가2
			 System.out.println();
			
}
}
}