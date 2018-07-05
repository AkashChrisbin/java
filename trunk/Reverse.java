package trainprog;

import java.util.Scanner;

public class Reverse {
public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the array of Inputs");
	int a[]=new int[50];
	int i;
	for( i=0;i<5;i++) {
		a[i]=in.nextInt();
		}
	
	for(int j=4;j>=0;j--) {
		System.out.println(a[j]);
	}
	
}
}
