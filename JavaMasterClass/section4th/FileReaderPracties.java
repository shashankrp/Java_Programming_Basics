package section4th;

import java.util.*;
import java.io.*;

//The scanner will have the filenotfoundexception that may arrise so we use throws FileNotFoundException in the main line
public class FileReaderPracties {

	public static void main(String[] args) throws FileNotFoundException {
		try {
		Scanner scfile = new Scanner(new File("names.txt"));
		String line = "", first = "", second = "";
		int age = 0;
		while (scfile.hasNext()) {
			line = scfile.nextLine();
			Scanner scline = new Scanner(line).useDelimiter("#");
			first = scline.next();
			second = scline.next();
			age = scline.nextInt();
			scline.close();
			System.out.println(first.charAt(0) + "." + second + " " + age);
		}
		scfile.close();
	    }catch(FileNotFoundException e) {
	    	System.out.println("Its all broken");
	    }
		}

}
