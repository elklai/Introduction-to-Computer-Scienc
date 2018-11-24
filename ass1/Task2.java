import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

            // ----------------- write your code BELOW this line only --------
            Scanner myScanner= new Scanner (System.in);
            int n= myScanner.nextInt();
            double d;//distance
            int counter=0;
            for(int i=0;i<n;i=i+1){
            	double x=Math.random()*2;
            	double y=Math.random()*2;
            	d=(x-1)+(y-1);
            	if(d<0)
            		d=d*-1;
            	if(d<1)
            		counter=counter+1;
            }
            double p=4.0*(double)counter/(double)n;//pai/4 = counter/n (almost)
			
            System.out.print(p);
           
            // ----------------- write your code ABOVE this line only ---------

	}
}
