package section4th;
import java.util.*;

import javax.swing.JOptionPane;
public class DelimiterAndBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "number john #test #sentance \n #45";
		Scanner scline=new Scanner(line).useDelimiter("#");
		int counter=0;
		while(scline.hasNext()) {
			String temp=scline.next();
			counter++;
		}
		System.out.println(counter);
	}

}
