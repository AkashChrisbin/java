package trainprog;

import java.util.Scanner;

public class Compare {
public static void main(String args[]) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter 1 for String sort and 2 for numeric sort");
	int a;
	int i,j;
	String tp;
	a=in.nextInt();
	if(a==1)
	{   System.out.println("Enter the number of words to be entered");
	     int n=in.nextInt();
	     n=n+1;
		String [ ] word =new String[50];
		System.out.println("Enter the Words for the sort");
		for( i=1;i<=n;i++) {
			word[i]=in.nextLine();
		}
		for(i=1;i<=n;i++) {
			for(j=i+1;j<=n;j++) {
			 
				if((word[i].compareTo(word[j]))>0) {
				 tp=word[i];
				 word[i]=word[j];
				 word[j]=tp;
			 }
			}
		}
		System.out.print("Names in Sorted Order:");
        for ( i = 1; i <= n ; i++) 
        {
        	System.out.println(word[i]);
        }
	}
	int s;
	if (a==2) {
		System.out.println("Enter the number of inputs to be given ");
		int n=in.nextInt();
		System.out.println("Enter the numbers");
		int [] r=new int[n];
		for(i=0;i<n;i++) {
			r[i]=in.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if (r[i]>r[j])
				{
					s=r[i];
					r[i]=r[j];
					r[j]=s;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(+r[i]);
		}
	}
	in.close();
}
}
