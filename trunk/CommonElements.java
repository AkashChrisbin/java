package trainprog;

import java.util.Scanner;

public class CommonElements {
    public static void main(String args[]) {   
	      searchElement();
    }
    public static void searchElement() {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter 1 for integer comman and 2 for String comman");
    	int a,sizeOfA,sizeOfB;
    	int i,j;
    	boolean aEnter=false;
    	a=in.nextInt();
    	if(a==1) {
    		System.out.println("Enter the number of elements to be entered to Array A");
    		sizeOfA=in.nextInt();
    		int []aArray=new int[sizeOfA];
    		System.out.println("Enter the elements of Array A");
    		for(i=0;i<sizeOfA;i++) {
    			aArray[i]=in.nextInt();
    		}
    		System.out.println("Enter the number of elements to be entered to Array B");
    		sizeOfB=in.nextInt();
    		int []bArray=new int[sizeOfB];
    		System.out.println("Enter the elements of Array A");
    		for(i=0;i<sizeOfB;i++) {
    			bArray[i]=in.nextInt();
    		}
    		for(i=0;i<aArray.length;i++) {
    			for(j=0;j<bArray.length;j++) {
    				if(aArray[i]==bArray[j]) {
    					System.out.println("The Common Element in is "+aArray[i] );
    				}
    			}
    		}
    	}
    	if(a==2) {
    		String inputA,inputB;
    		if(aEnter==false) {
    		 System.out.println("Enter the Input for A");
    		 inputA=in.nextLine();
    		 aEnter=true;
    		
    		if(aEnter==true) {
    		 System.out.println("Enter the Input for B");
    		 inputB=in.nextLine();
    		
    		 String[]wordsA=inputA.split(" ");
    		 String[]wordsB=inputB.split(" ");
    		 for( i=0;i<wordsA.length;i++) {
    			 for( j=0;j<wordsB.length;j++) {
    				 if(wordsA[i].equals(wordsB[j])) {
    					 System.out.println("The Common Element in is "+wordsA[i]);
    				 }
    			 }
    		 }
    		}
    		}

    	}
    	in.close();
}
}
