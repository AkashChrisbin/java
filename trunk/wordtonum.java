package trainprog;
import java.util.*;
public class wordtonum {
    public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	
	int a;
	System.out.println("Enter the word to be converted to number range 1 to 9");
    String words[] = new String[100];
    
    	System.out.println("Enter 1 to enter value");
    	a=in.nextInt();
    	if(a==1)
    	{
    		System.out.println("Enter value of units place(no caps)");
    		words[0]=in.nextLine();


    		
    	}
    	
    	if(words[0].equals("one"))
    	{
    		System.out.println("Value is 1");
    	}
    	if(words[0].equals("two"))
    	{
    		System.out.println("Value is 2");
    	}
    	if(words[0].equals("three"))
    	{
    		System.out.println("Value is 3");
    	}
    	if(words[0].equals("four"))
    	{
    		System.out.println("Value is 4");
    	if(words[0].equals("five"))
        	{
        		System.out.println("Value is 5");
        		
        	}
    	if(words[0].equals("six"))
        	{
        		System.out.println("Value is 1");
        	}
   		if(words[0].equals("seven"))
        	{
        		System.out.println("Value is 7");
        	}
   		if(words[0].equals("eight"))
        	{
        		System.out.println("Value is 8");
        	}
   		if(words[0].equals("nine"))
        	{
        		System.out.println("Value is 9");
        	}
       
        	
    	}
    		
    	
    
    }
}
