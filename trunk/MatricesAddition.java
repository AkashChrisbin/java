package trainprog;

import java.util.Scanner;

public class MatricesAddition {
   public static void main(String args[]) {
	   addition();
	   }
   public static void addition() {
	   Scanner in=new Scanner(System.in);
	   //Variable declaration
	   int i,j;
	   int rOw =0;
	   int cOlumn=0;
	   System.out.println("Enter the no of rows");//getting the number of rows
	   rOw=in.nextInt();
	    if(rOw != 0) {
	    	System.out.println("Enter the no of columns");//getting the number of columns
	 	    cOlumn=in.nextInt();
	    	
	    }
	  //Variable declaration
	   int[][]aArray=new int[rOw][cOlumn] ;
	   int[][]bArray=new int[rOw][cOlumn] ;
	   int[][]cArray=new int[rOw][cOlumn] ;
	   
	   //Entering input of Matrix A
	   System.out.println("Enter Elements of A");
	   for(i=0;i<rOw;i++) {
		   for(j=0;j<cOlumn;j++) {
			   aArray[i][j]=in.nextInt();
		   }
	   }
	   
	   //Entering input of Matrix B
	   System.out.println("Enter Elements of B");
	   for(i=0;i<rOw;i++) {
		   for(j=0;j<cOlumn;j++) {
			   bArray[i][j]=in.nextInt();
		   }
	   }
	   
	   //Addition
	   for(i=0;i<rOw;i++) {
		   for(j=0;j<cOlumn;j++) {
			 cArray[i][j]=aArray[i][j]+bArray[i][j];   
		     }
		   }
	   System.out.println("The Result Matrix is ");
	   
	   //displaying the matrix
	   for(i=0;i<rOw;i++) {
		   for(j=0;j<cOlumn;j++) {
			 
			  System.out.print(cArray[i][j]);   
			  System.out.print("\t\t");
		     }
		   System.out.println();
		   }
	   in.close();
   }
}
