import java.util.Scanner;

public class Task8 {
	public static void main (String args[]){

            // ----------------- write your code BELOW this line only --------
			Scanner myScanner=new Scanner(System.in);
			int x=myScanner.nextInt();
			int y=myScanner.nextInt();
			int z=myScanner.nextInt();
			int tmp;
			if(x>=y){
				tmp=y;
				y=x;
			}
			else{
				tmp=x;
				x=y;
			}
			if (z<=tmp)
	            y=tmp;
			else{
				if(z>x){
					x=z;
					z=tmp;
				}
				else{
					y=z;
					z=tmp;
				}
			}	
			System.out.println(z);
			System.out.println(y);
			System.out.println(x);
				
            // ----------------- write your code ABOVE this line only ---------

	}
}
