//Program to evaluate the given items from the list of given salaries
package trainprog;
import java.util.*;
public class Salary {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		int [] n =new int[10];
		int a;
		System.out.println("Enter the number of salaries to be entered");
		a=in.nextInt();
		for(int i=0;i<a;i++) {
			System.out.println("Enter the Salary");
			n[i]=in.nextInt();
		}
		
		//To find the Average Salary and total sum
		int sum = 0;
		for(int i=0;i<a;i++) {
			sum= sum+n[i];
		}
		System.out.println("The Sum of Salary is"+sum);
	    sum= sum/a;
	    System.out.println("The average Salary is "+sum);
	    
	    //to find the Ascending order
	   
	    int j,k;
	     for(int i=0;i<a-1;i++) {
	    	for(j=i+1;j<a;j++) {
	    		if(n[i]>n[j]) {
	    		k=n[i];
	    		n[i]=n[j];
	    		n[j]=k;
	    		}
	   
	    	}
	    	}
	     for(int i=0;i<a;i++) {
				System.out.println("the ascending order is "+n[i]);
	     }
	//to find minimum value
	    int minvalue =n[0];
	    for(int i=0;i<a;i++) {
	    	if(minvalue>n[i]) {
	    		minvalue=n[i];
	    	}
	    }
		System.out.println("the minimum value  is "+minvalue);
 //to sort by descending order
		for(int i=0;i<a-1;i++) {
	    	for(j=i+1;j<a;j++) {
	    		if(n[i]<n[j]) {
	    		k=n[i];
	    		n[i]=n[j];
	    		n[j]=k;
	    		}
	   
	    	}
	    	}
	     for(int i=0;i<a;i++) {
				System.out.println("the descending order is "+n[i]);
	     }
 // to find minimum value
	     int maxvalue =n[0];
		    for(int i=0;i<a;i++) {
		    	if(maxvalue<n[i]) {
		    		maxvalue=n[i];
		    	}
		    }
			System.out.println("the maximum value  is "+maxvalue);
	     
	in.close();
	}
    
}
