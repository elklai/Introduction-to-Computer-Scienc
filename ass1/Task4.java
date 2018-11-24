import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

            // ----------------- write your code BELOW this line only --------
            Scanner myScanner=new Scanner(System.in);
            int m=myScanner.nextInt();
            int a=1;
            int b=1;
            int fib=2;
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
