package ComprinnoTest;

import java.util.Scanner;

public class Question6 {
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner scanner = new Scanner(System.in);
        long T = scanner.nextLong();

        while (T-->0){
           long  C = scanner.nextLong();
           long  D = scanner.nextLong();
           long  L = scanner.nextLong();
           long  r = 0;
           if(C>D*2){
                r=C-(2*D);
            }
            if (L<=(C+D)*4 && L>=(D+r)*4 && L%4 ==0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
	}
}
