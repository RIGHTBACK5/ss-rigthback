package first;
import java.util.Random;

public class lbackthe {
 public static void main(String[] args) {
  Random mint = new Random();

  int[][] num = new int[6][6];
  int ang = 0;
  for (int a = 0; a < 6; a++) {
   for (int b = 0; b < 6; b++) {
    if (a < 5) {
     num[a][b] = mint.nextInt(100);
     System.out.print(num[a][b] + " ");
    } else {
     for (int c = 0; c < 6; c++) {
      ang = ang + num[c][b];
     }
     System.out.print(ang + " ");
    }
    ang = 0;
   }
   System.out.println();
  }
 }
}

