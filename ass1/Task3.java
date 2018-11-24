import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {


            // ----------------- write your code BELOW this line only --------
            Scanner myScanner=new Scanner(System.in);
            int n=myScanner.nextInt();
            int a=1;
            int b=1;
            if(n==1){
            	System.out.println(1);
            	System.out.println(2);
            }
            else{
            	int fib=0;
            	int i;
            	for(i=2;i<=n+2;i=i+1){
            		if(i==n+1)
            			System.out.println(fib);
            		if(i==n+2)
            			System.out.println(fib);
            		fib=a+b;
            		a=b;
            		b=fib;
            	}
            }	
            // ----------------- write your code ABOVE this line only ---------


	}
}
