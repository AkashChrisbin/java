//second largest element and Second Smallest in an array. 
package trainprog;

import java.util.Scanner;

public class SecondLarge {
  public static void main(String args[]) {
	  sortNumber();//Calling sort operations
  }
  public static void sortNumber() {
	  Scanner in=new Scanner(System.in);
	  int n;
	  int i,j,t;
	  System.out.println("Enter the no of inputs");
	  n=in.nextInt();//getting no of inputs from the user
	  int [] aArray = new int [n];

	  System.out.println("Enter the inputs to the Array");
	  for(i=0;i<n;i++) {
           aArray[i]=in.nextInt(); //getting inputs from the user             
        }
	  
	  System.out.println("Enter 1 to find Second largest number\n "
	  	              + "Enter 2 to find the Second Smallest number");//toggle between largest and smallest
     
      
	  int a=in.nextInt();//getting option from the user
      if(a==1)//redirecting to largest search
      {//sorting in descending order
    	for(i=0;i<n-1;i++) {
    		for(j=i+1;j<n;j++) {
    			if(aArray[i]<aArray[j]) {
    			   t=aArray[i];
    			   aArray[i]=aArray[j];
    			   aArray[j]=t;
    			}
    		}
    	}
    	System.out.println("the Second largest number is :"+aArray[1]);//displaying the second largest position
      }
      if(a==2)//redirecting to the smallest search
      {//sorting in ascending order
    	for(i=0;i<n-1;i++) {
    		for(j=i+1;j<n;j++) {
    			if(aArray[i]>aArray[j]) {
    			   t=aArray[i];
    			   aArray[i]=aArray[j];
    			   aArray[j]=t;
    			}
    		}
    	}
    	System.out.println("the Second largest number is :"+aArray[1]);////displaying the second smallest position
      }
      in.close();
  }
}
