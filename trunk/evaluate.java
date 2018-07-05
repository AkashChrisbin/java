package trainprog;
import java.util.*;
public class evaluate {
 public static void main(String args[]) {
	 int a=0,b=0,res=0,ab=0;
	 Scanner in =new Scanner(System.in);
	 System.out.println("Enter the value of A");
	 a=in.nextInt();
	 System.out.println("Enter the value of B");
	 b=in.nextInt();
	 ab=a*b;
	 res=a^5+b^12+2*ab;
	 System.out.println("The value is "+res);
in.close();
 }
}
