//convert an array to ArrayList
package trainprog;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraytoArraylist {
   public static void main(String args[]) {
	conversionList();
	}
   public static void conversionList() {
	   Scanner in=new Scanner(System.in);
	   
	   //declaration the array list and variables
	   ArrayList<String> anArrayList = new ArrayList<String>();
	   int i,n;
	   
	   //getting the no of input from the user
	   System.out.println("Enter the number of input to entered");
	   n=in.nextInt();
	   
	   //declaring the array
	   String []aRray=new String[n+1];
		System.out.println("Enter the input"); 
	   
		//getting the inputs from the user
		for(i=0;i<=n;i++) {
		   aRray[i]=in.nextLine();
	   }
		
	   //Conversion to arraylist
	   for(i=0;i<aRray.length;i++) {
		   anArrayList.add(aRray[i]);
	   }
	   
	   //Printing the arraylist
	   System.out.println("Array to Arraylist ");
	   for(String sTr:anArrayList) {
		   System.out.println(sTr);
	   }
	   //Conversion of arraylist to array
	   System.out.println("Arraylist to Array");
	   String []iTem= anArrayList.toArray(new String[anArrayList.size()]);
	   for(String vAlue : iTem) {
		   System.out.println(vAlue);
	   }
	in.close();	   
   }
}
