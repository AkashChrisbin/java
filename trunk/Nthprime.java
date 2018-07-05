package trainprog;
import java.util.*;
public class Nthprime {
 public static void main(String args[]) {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the number to find nth prime number");
	 int n,i=2,x=2;
	 n=in.nextInt();
	 for(i=2;i<n;i++) {
		 for(x=2;x<i;x++) {
			 if(i%x==0) {
				 break;
			 }
		 }
		 if(x==i) {
			 System.out.print("\n The number is prime  " +x);
		 }
	 }
     in.close();
 }
}
