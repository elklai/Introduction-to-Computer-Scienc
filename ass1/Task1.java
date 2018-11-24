import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {


            // ----------------- write your code BELOW this line only --------
            Scanner myScanner=new Scanner(System.in);
            int x=myScanner.nextInt();
            int y=myScanner.nextInt();
            int z=myScanner.nextInt();
            int max=0;
            if(x>=y)
            	max=x;
            else
            	max=y;
            if(max>=z)
            	max=max;
            else
            	max=z;
            System.out.println(max);

            // ----------------- write your code ABOVE this line only ---------



	}
}




