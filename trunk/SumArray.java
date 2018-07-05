package trainprog;

import java.util.Scanner;

public class SumArray {
public static void main(String args[]) {	 
int x,n;
Scanner in =new Scanner(System.in);
System.out.println("Enter 1 to sum in aaray");
x=in.nextInt();
while(x==1) {
System.out.println("Enter number of inputs");
n=in.nextInt();
int []e=new int[n];

int result=0;

	for(int i=0;i<n;i++) {
		e[i]=in.nextInt();
		
	}
	for(int i=0;i<n;i++) {
		result=result+e[i];
	}
	System.out.println(result);
	break;
}

in.close();
}
}
