//Program to accept a series of inputs and iterate through a list. Find out the sum of all inputs
package trainprog;
import java.util.*;
public class Interations {
	public static void main(String args[]) {
		int a;
		//for getting no of inputs to be entered
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of inputs to be given");
		a=in.nextInt();
		interate(a);
		in.close();
	}
	// for iteration
    public static void interate(int a) {
    	int [] b =new int[10];
    	Scanner in=new Scanner(System.in);
    	for(int i=0;i<a;i++) {
    		System.out.println("enter the input");
    		b[i]=in.nextInt();
    	}
    	//for summing the input
    	int sum =0;
    	for(int i=0;i<a;i++) {
    		sum= sum +b[i];
    		
    	}
    	System.out.println("the sum is :" +sum);
    	in.close();
    }
}
