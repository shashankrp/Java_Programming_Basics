package section4th;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Project {

	public static void main(String[] args) throws IOException {
		try {
			Scanner scfile=new Scanner(new File("marks.txt"));
			PrintWriter outfile=new PrintWriter(new FileWriter("results.txt", true));
			String line = "", first = "", second = "";
			float marks = 0;
			boolean a;
			while (scfile.hasNext()) {
				line = scfile.nextLine();
				Scanner scline = new Scanner(line).useDelimiter("#");
				first = scline.next();
				second = scline.next();
				marks = scline.nextFloat();
				a=scline.nextBoolean();
				scline.close();
				System.out.println(first.charAt(0) + "." + second + " " + marks+"% "+a);
			}
			scfile.close();
			outfile.close();
			
		}catch(FileNotFoundException e) {
			
		}
		catch(IOException i) {
			
		}

	}

}
