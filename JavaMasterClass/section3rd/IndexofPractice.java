package section3rd;

public class IndexofPractice {
	public static void main(String[] args) {
		String sent="This is a random sentance";
		System.out.println(sent.indexOf('s'));
		System.out.println(sent.charAt(3));
		System.out.println(sent.lastIndexOf('c'));
		System.out.println(sent.length());
		System.out.println(sent.substring(sent.indexOf("random"), sent.indexOf("random")+6));
	}
}
