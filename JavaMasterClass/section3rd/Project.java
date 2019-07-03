package section3rd;

import javax.swing.JOptionPane;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sent = JOptionPane.showInputDialog("Enter your first name, middle name and last name by separating them by the space");
		String f_name=sent.substring(0,sent.indexOf(' '));
		//System.out.println(f_name);
		String m_name=sent.substring(sent.indexOf(' ')+1,sent.lastIndexOf(' '));
		//System.out.println(m_name);
		String l_name=sent.substring(sent.lastIndexOf(' ')+1);
		//System.out.println(l_name);
		System.out.println("First: "+f_name+"\nMiddle: "+m_name+"\nLast: "+l_name+"\n"+sent);
	}

}
