import java.util.Scanner;

public class Task7 {
	public static void main (String args[]){

			// ----------------- write your code BELOW this line only --------
				//first notice that we get "n" entrances to the loop when we take
				//the numbers in places n+3,n+2 from Fibonacci Sequence
				//easy to prove it by Induction
		        Scanner myScanner=new Scanner(System.in);
		        int n=myScanner.nextInt();
		        int a=1;
		        int b=1;
		        if (n==0){
		        	System.out.println(1);
		        	System.out.println(1);
		        }
		        else{
		        	int fib=0;
		        	int i;
		        	for(i=2;i<=n+3;i=i+1){
		        		if(i==n+2)
		        			System.out.println(fib);
		        		if(i==n+3)
		        			System.out.println(fib);
		        		fib=a+b;
		        		a=b;
		        		b=fib;
		        	}
		        }	
            // ----------------- write your code ABOVE this line only ---------

	}
}
