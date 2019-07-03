package section5;

import javax.swing.*;
public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stg="This is a random sentance";
		String arr[]=stg.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
