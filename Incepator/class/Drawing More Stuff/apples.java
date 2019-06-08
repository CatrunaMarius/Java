import java.awt.Color;

import javax.swing.*;



class apples{
	public static void main (String[] args) {
		
		JFrame f =new JFrame("Title");
		Peach p = new Peach();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setBackground(Color.WHITE);
		f.add(p);
		f.setSize(500,270);
		f.setVisible(true);
		
		
	}
	
}
