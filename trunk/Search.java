//Java program to test if an array contains a specific value &&  find the index of an array element&&remove a specific element from an array 

package trainprog;
import java.util.*;
public class Search {
  public static void main(String args[]) {
	  searchArray();
  }
  public static void searchArray() {
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter the no inputs to be entered");
	  int i;
	  boolean isfound=false;
	  
	  int a=in.nextInt();//getting the no of inputs
	  int []aArray=new int[a];
	  System.out.println("Enter the values");//getting the values from the user
	  for(i=0;i<a;i++) {
		  aArray[i]=in.nextInt();
		  }
	  System.out.println("Enter value to be searched");//getting the values to be searched
	  int k=in.nextInt();
	  for(i=0;i<a;i++) {
		  if(aArray[i]==k) {//Searching for the element
			  int r=i+1;
			  System.out.println("Element found "+aArray[i]+" in the position "+r);
			  isfound=true;
		  }
		  
		  
	  }
	  if(isfound==false) {
		  System.out.println("Element not found");
	  }
	  System.out.println("If you wnt to delete a value from the array press 1");
	  int x=in.nextInt();
	  if(x==1) {
		  System.out.println("Enter value to be deleted");//getting a specific value to delete
		  int c=in.nextInt();
		  for(i=0;i<a;i++) {
			  if(aArray[i]==c) 
			  {
				  aArray[i]=0;//value being deleted
			  }
		
			  
	  }
		  System.out.println("The modified Array list is");
		  for(i=0;i<a;i++) {
			  if(aArray[i]!=0) {
			  System.out.print(aArray[i]+",");
			  }
		  }
	  in.close();
  }
}
}