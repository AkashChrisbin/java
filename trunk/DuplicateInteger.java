//duplicate values of an array of integer values&&Integer values
package trainprog;

import java.util.Scanner;//Scanner is imported for getting input from the user

public class DuplicateInteger {
public static void main(String args[]) {
     count();
}
public static void count() {
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter the Input");
	 String input=in.nextLine();
	 String[]words=input.split(",");//input is separated from each other by , and stored as seperte input
	 
	 for(int i=0;i<words.length;i++) {
		 for(int j=i+1;j<words.length;j++) {
			 if((words[i].equals(words[j]))&&(i!=j))//Comparison of  given inputs
				 {
			      int k=j+1;
				  System.out.println("The duplicate input in position "+k+ " is: "+words[i]);
				  break;
			 }
			
		 }
		 
     in.close();
	 }
	
}
}
