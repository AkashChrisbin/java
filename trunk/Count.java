//Given a non-empty array of integers, every element appears twice except for one. Find that single one
package trainprog;
import java.util.Scanner;
import java.lang.String;
public class Count {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		String input;
		System.out.println("Enter the value");
		input=in.nextLine();
		String[] words=input.split(",");
		int wrc=1;
		System.out.println("The Odd one out is");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					wrc=wrc+1;
					words[i]="0";
					words[j]="0";
				}
			}
			
			if(words[i]!="0") {
				
				System.out.print(words[i]);
				System.out.print(",");
				wrc=1;
			}
		}
		in.close();
	}

}
