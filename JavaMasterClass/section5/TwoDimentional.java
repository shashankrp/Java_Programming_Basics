package section5;

import javax.swing.*;

public class TwoDimentional {

	public static void main(String[] args) {
		int arr[][] = new int[4][5];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}

}
