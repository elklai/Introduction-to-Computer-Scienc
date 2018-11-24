// You may not change or erase any of the lines and comments 
// in this file. You may only add lines.

import java.util.Scanner;

public class Task10 {


    public static void main(String[] args){


            // ----------------- write any code BELOW this line only --------
            int x1;
            int x2;
            int x3;
            int x4;
    		int a;
            int b;
            int c;
            int d;
            boolean good=true;
            for(a=0;a<=1;a=a+1){
            	x1=a;
            	for(b=0;b<=1;b=b+1){
            		x2=b;
            		for(c=0;c<=1;c=c+1){
            			x3=c;
            			for(d=0;d<=1;d=d+1){
            				x4=d;
            				//

            	            
            // ----------------- write any code ABOVE this line only ---------




            // -----------------  copy here the code from Task 9 that is between
            // -----------------  the comments "A" and "B"
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
            //
            // -----------------  end of copied code from Task 9




            // ----------------- write any code BELOW this line only --------
            				if(!((x1<=x2)&&(x2<=x3)&&(x3<=x4))){
            					System.out.println(x1);
            					System.out.println(x2);
            					System.out.println(x3);
            					System.out.println(x4);
            					good=false;
            				}
            			}
            		}
            	}
            }
            if(good)
            	System.out.println("verified"); 
            // ----------------- write any code ABOVE this line only ---------

    } // end of main
} //end of class Task10

