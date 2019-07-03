package section4th;


//They automatically convert datatype searching for next int will convert string to integer 
//import the required package
//create the scanner object:- Scanner scLine=new scanner(Filename or word);
//use method
//close scanner:- scLine.close();
import java.util.*;
public class ScannerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "Hello 40 2.5 true";
		Scanner scline=new Scanner(line);
		String word=scline.next();
		int num=scline.nextInt();
		double dnum=scline.nextDouble();
		boolean test=scline.nextBoolean();
		scline.close();
		System.out.println(word+"\n"+num+"\n"+dnum+"\n"+test);
	}

}
