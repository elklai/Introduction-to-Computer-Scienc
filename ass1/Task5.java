import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
            final int m = Integer.MAX_VALUE;

            // ----------------- write your code BELOW this line only --------
            long a=1;
            long b=1;
            long fib=2;
            while (fib<=m){
            	a=b;
            	b=fib;
            	fib=a+b;
            }
            System.out.println(a);
            System.out.println(b);
            // ----------------- write your code ABOVE this line only ---------
		
		
	}
}
