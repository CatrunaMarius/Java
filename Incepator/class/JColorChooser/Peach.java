import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JFrame {
	private JButton b;
	private Color color =(Color.WHITE);
	private JPanel panel;
	
	//constructor
	public Peach () {
		super("The title");
		panel = new JPanel();
		panel.setBackground(color);
		
		//creare buton
		b = new JButton("Choose a color");
		//creare functie a butonului
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						//ce  face functia-aici alegi culoare
						color = JColorChooser.showDialog(null, "Pick you color", color);
						//in cazul in care nu se alege o culoare automat va fi alb
						if(color ==null)
							color=(Color.WHITE);
						
						panel.setBackground(color);
					}
				}
				
				);
		
		        add(panel, BorderLayout.CENTER);//panoul va aparea in centru ecranulu
		        add(b, BorderLayout.SOUTH);//butonul va apare jos in ecram
		        setSize(425,150);
		        setVisible(true);
	}



}
