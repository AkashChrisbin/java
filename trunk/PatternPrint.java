package trainprog;
import java.util.*;
public class PatternPrint {
     public static void main(String args[]){
    	   printPattern();//Function calling//
     }
    public static void printPattern(){
    	Scanner in= new Scanner(System.in);
    	String a;
    	System.out.println("Enter the charactern to be printed as pattern");
    	a=in.nextLine();//getting the character from the user to print//
    	for (int i=0;i<10;i++) {
    		for(int j=0;j<10;j++) {
    			System.out.print("\t"+a);//printing the pattern//
    		}System.out.println();
    	}
    	in.close();
    }
}
