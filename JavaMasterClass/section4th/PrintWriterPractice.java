package section4th;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class PrintWriterPractice {

	public static void main(String[] args) throws IOException {
		PrintWriter outfile=new PrintWriter(new FileWriter("printing.txt", true));
		outfile.println("Hello World");
		String temp=JOptionPane.showInputDialog("Enter a sentance, type stop to stop");
		while(!temp.equals("stop")) {
			outfile.println(temp);
			temp=JOptionPane.showInputDialog("Enter a sentance, type stop to stop");
		}
		outfile.close();
	}

}
