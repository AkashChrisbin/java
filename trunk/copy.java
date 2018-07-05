package trainprog;
import java.io.*;
public class copy {
public static void main(String[] args) throws IOException {
	FileInputStream in= null;
	FileOutputStream out =null;
	
	in=new FileInputStream("/Users/SHAMINE/Downloads/original.txt");
	out=new FileOutputStream("/Users/SHAMINE/Downloads/duplicate.txt");
	int c;
	 while ((c = in.read()) != -1) {
		out.write(c);
	}
	 in.close();
	 out.close();
}
}
