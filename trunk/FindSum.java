package trainprog;

import java.util.Scanner;

public class FindSum {
  public static void main(String args[]) {
	  findSum();
  }
  public static void findSum() {
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number of input");
	  //variable declarations
	  int i,j,k;
	  int n=in.nextInt();
	  int []anArray= new int[n];
	  
	  //getting the value from the user
	  System.out.println("Enter the elemnts");
	  for(i=0;i<n;i++) {
		  anArray[i]=in.nextInt();
	  }
	  
	  //to find the pair of elements whose sum is equal to  specific value
	  System.out.println("Enter the value to be searched");
	  k=in.nextInt();
	  
	  //finding the values
	  for(i=0;i<n;i++) {
		  for(j=1;j<n;j++) {
			  if(anArray[i]+anArray[j]==k) {
				  System.out.println("the pair is "+anArray[i]+" and "+anArray[j] );
			  }
		  }
	  }
	  in.close();
  }
}
