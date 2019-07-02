package overriding;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Drawing extends JFrame {
	public static void main(String[] args) {
		new Drawing();
	}

	public Drawing() {
		setTitle("Drawing");
		setSize(500, 500);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		// super.paint(g);
		g.drawRect(50, 50, 100, 25);
		g.drawOval(200, 50, 50, 50);
		g.setColor(new Color(0, 0, 255));
		g.setColor(Color.GREEN);
		g.fillRect(52, 200, 100, 25);
		g.setColor(Color.BLACK);
		g.drawString("My String", 200, 200);
	}
}
