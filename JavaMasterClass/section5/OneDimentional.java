package section5;

import javax.swing.*;
public class OneDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		}
		System.out.println(arr.length);

	}

}
