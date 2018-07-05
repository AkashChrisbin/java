//Program to print a pyramid with the given character and size

package trainprog;
import java.util.*;
public class Pyramid {// Function to demonstrate printing pattern
 public static void main(String args[]) {
	 Scanner in=new Scanner(System.in);
	 int a;
	 System.out.println("Enter the number of rows");
	 a=in.nextInt();
	 printtriangle(a);
	 in.close();
 }
public static void printtriangle(int a) {
	Scanner in=new Scanner(System.in);
	String b;
	System.out.println("Enter the charater to be printed");
	b=in.nextLine();
	int k,i,j;
	k=2*a-2;
//for printing the pyramid
	for(i=0;i<a;i++) {
		for(j=0;j<k;j++) {
			System.out.print("  ");
		}
	
    k=k-1;
    for(j=0;j<=i;j++) {
    	System.out.print("");	
    	System.out.printf(" %s ",b);
    	System.out.print("");
    }
    System.out.println();
}
	//for printing the inverse pyramid
	 System.out.println();
	 k=1;
	 for(i=0;i<a;i++) {
			for(j=0;j<k;j++) {
				System.out.print("  ");
			}
		int l;
		l=a;
	    k=k+1;
	    
	    for(j=l-i;j>0;j--) {
	    	System.out.print("");	
	    	System.out.printf(" %s ",b);
	    	System.out.print("");
	    	
	    
	    
	    }
	    System.out.println();	
	 }in.close();
}
}