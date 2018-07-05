package trainprog;
import java.util.*;
public class numtoword {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int number;
		number=0;
		System.out.println("Enter the number to be converted to words Range 0-999");
		number= in.nextInt();
		try {
			if(number==0)
			{
				System.out.println("The number is zero");
			}
			else {
				System.out.println("the given number is:"+numberToWord(number));
			}
			}
		catch (Exception e)
		{
			System.out.println("Please enter a valid number");
		}
		in.close();
	}
	
 private static String numberToWord(int number)
 {
	 String words = "";
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                             "seven", "eight", "nine", "ten", "eleven", "twelve",
                             "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                             "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                              "sixty", "seventy", "eighty", "ninety" };
		
		if (number == 0) {
			return "zero";
		}
		if ((number / 100) > 0) {
			words += numberToWord(number / 100) + " hundred ";
			number %= 100;
		}
		if (number > 0) {
			if (number < 20) {
                
                words += unitsArray[number];
       }
			else { 
                
                words += tensArray[number / 10]; 
                if ((number % 10) > 0) 
                {
                words += "-" + unitsArray[number % 10];
                }
			}
		}
		return words;
 }
	 
 }