package section5;

import javax.swing.*;

public class Project {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Enter a list of sports for the first sports man");
		String arr1[] = s1.split(" ");
		String s2 = JOptionPane.showInputDialog("Enter a list of sports for the second sports man");
		String arr2[] = s2.split(" ");

		if (arr1.length > arr2.length) {
			System.out.println("The First sportsman does sports");
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i]);
			}
		} else {
			System.out.println("The second sports man does sports");
			for (int i = 0; i < arr2.length; i++) {
				System.out.println(arr2[i]);
			}
		}
	}

}
