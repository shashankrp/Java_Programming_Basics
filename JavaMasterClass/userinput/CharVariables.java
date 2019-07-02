package userinput;

public class CharVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//converting char to string
		char ch='5';
		String word=""+ch;
		System.out.println(word);
		
		//converting char to integer 
		int num=Integer.parseInt(""+ch);
		System.out.println(num);
		
		//converting string to char
		String test="word";
		char tester = test.charAt(0);
		System.out.println(tester);
		
		//converting int to char
		int num1=6;
		tester=(""+num1).charAt(0);
		System.out.println(tester);
	}

}
