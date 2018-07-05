//Given a collection of numbers that might contain duplicates, return all possible unique permutations.
package trainprog;
import java.util.*;
public class Permutation {
public static void main(String args[]) {
	permutate();//calling a function permutate//
}
	public static void permutate() {
	int []a= new int [3];
	int []b= new int [3];
	int []c= new int [3];
	int j;
	boolean ispermutatr =true;
	Scanner in =new Scanner(System.in);
	//getting values from the user//
	for (int i=0;i<3;i++) {
		System.out.println("Enter the input to inserted into array (if all the elements are same do not enter)");
		a[i]=in.nextInt();
	}
	//Checking if all the elements in the array are same//
	if(a[0]==a[1])
	{ 
		if(a[0]==a[2]) {
		 ispermutatr=false;
		 System.out.println("No possibilities");
	}
	}
	if(ispermutatr) {
     //Interchanging of values of position occurs//
		for (int i=0;i<3;i++) {
		j=i+1;
		if(j!=3)
		{
			b[i]=a[j];
		}
		else
		{
			b[i]=a[j-3];
		}
	} 
	for (int i=0;i<3;i++) {
		j=i+1;
		if(j!=3) {
			c[i]=b[j];
		}
		else
		{
			c[i]=b[j-3];
		}
		
	}
 // Printing of interchanged values //
		for (int i=0;i<3;i++) {
		   System.out.print("\t" +a[i]);
		  }
		 System.out.println();
		 for (int i=0;i<3;i++) {
			   System.out.print("\t" +b[i]);
			  }
			 System.out.println();
			 for (int i=0;i<3;i++) {
				   System.out.print("\t" +c[i]);
				  }
				 System.out.println();
	}
	   in.close();
}
}
