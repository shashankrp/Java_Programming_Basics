package section4th;
import java.util.*;
import javax.swing.*;
public class ScannerUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = JOptionPane.showInputDialog("Enter full name and age");
		Scanner scline=new Scanner(line);
		String first=scline.next();
		String last=scline.next();
		int num=scline.nextInt();
		scline.close();
		System.out.println(first+"\n"+last+"\n"+num);
	}

}
