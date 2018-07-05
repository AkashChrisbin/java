package trainprog;
import java.util.regex.*;
public class regularexp {
public static void main(String args[]) {
	Pattern pattern;
	Matcher matcher;
	String w= "MY NAME IS AKASH";
	pattern=Pattern.compile("AKASH");
	matcher=pattern.matcher(w);
	if(matcher.find())
	{
		System.out.println("Found");
		System.out.println("Match Starts from  "+matcher.start()+"  Match ends at  "+matcher.end());
	}
}
}
