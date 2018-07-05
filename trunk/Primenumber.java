package trainprog;
import java.util.*;
public class Primenumber {
public static void main(String args[]) {
	int num,i,res;
	res=0;
	boolean isPrime=true;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number ");
	num=in.nextInt();
	for(i=2;i<num/2;i++) {
		res=num%i;
		if(res==0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime) {
		System.out.println("The given number is prime");
	}
	else {
		System.out.println("The given number is not prime");
	}
 in.close();
}
}
