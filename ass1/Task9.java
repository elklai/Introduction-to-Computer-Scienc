// You may not change or erase any of the lines and comments 
// in this file. You may only add lines in the designated 
// area.

import java.util.Scanner;

public class Task9 {


    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int x3 = scanner.nextInt();	
            int x4 = scanner.nextInt();

            // ----------------- "A": write your code BELOW this line only --------
            int tmp;
            if (x4>=x3){
            	tmp=x3;
            	x3=x4;
            }
            else{
            	tmp=x4;
            	x4=x3;
            }
            if(x2<=tmp){
            	x3=tmp;
            	tmp=x2;
            }
            else{
            	if(x2>=x4){
            		x4=x2;
            		x2=tmp;
            	}
            	else{
            		x3=x2;
            		x2=tmp;
            	}
            }
            if(x1>=x4){
            	x2=x3;
            	x3=x4;
            	x4=x1;
            	x1=tmp;
            }	
            else{
            	if(x1>=x3){
            		x2=x3;
            		x3=x1;
            		x1=tmp;
            	}
            	else{
            		if(x1>=x2){
            			x2=x1;
            			x1=tmp;
            		}
            		
            	}
            }
            // ----------------- "B" write your code ABOVE this line only ---------

            System.out.println(x1);
            System.out.println(x2);
            System.out.println(x3);
            System.out.println(x4);

    } // end of main
} //end of class Task9

