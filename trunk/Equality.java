//Java program to test the equality of two arrays
package trainprog;

import java.util.Scanner;

public class Equality {
	public static void main(String args[]) {
		compareClass();
	}
	public static void compareClass() {
		Scanner in =new Scanner(System.in);
		
		//variables declaration
		int i,j,n,m;
		int count=0;
		//getting no of input for aArray from user
		System.out.println("Enter the no of inputs for A");
		n=in.nextInt();
		
		//getting no of input for bArray from user
				System.out.println("Enter the no of inputs for B");
				m=in.nextInt();

		
		//variable declarations
		int[]aArray=new int[n];
		int[]bArray=new int[m];
		
		// Entering the elements of aArray
		System.out.println("Enter the elemnts of aArray");
		for(i=0;i<n;i++) {
			aArray[i]=in.nextInt();
		}
		
	    //Entering the elements of bArray
		System.out.println("Enter the elemnts of bArray");
		for(i=0;i<m;i++) {
			bArray[i]=in.nextInt();
		}
		
		//checking equality
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(aArray[i]==bArray[j]) {
					count++;
				}
			}
		}
	  System.out.println("The equality is "+count+" of "+n+" Inputs of aArray and " +m+ " Inputs of bArray");
      in.close();
}
}
