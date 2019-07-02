package userinput;

public class DoubleVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum=5.5;
		System.out.println(dnum+14.3);
		
		//converting variable to integer
		int num=(int) dnum;
		System.out.println(num+5);
		
		//converting variable to char
		char ch =(""+dnum).charAt(0);
		System.out.println(ch);
		
		//converting variable to string 
		String word = ""+dnum;
		System.out.println(word);
		
		//convering int to double 
		int num1=5;
		double dnum1=num1;
		System.out.println(dnum1);
		
		String word1 = "6.7";
		dnum1=Double.parseDouble(word1);
		System.out.println(dnum1);
		
		char ch1='5';
		dnum1=Double.parseDouble(""+ch);
		System.out.println(dnum1);
	}

}
