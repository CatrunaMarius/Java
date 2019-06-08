package apples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class GUi extends JFrame {
    private String details; 
    private JLabel statusbar;   
   
    //construnctor
    public GUi () {
    	super("The title"); //numele ferestei
    	
    	
    	
    	
    	statusbar = new JLabel("default"); //statusul barei
    	add(statusbar, BorderLayout.SOUTH); //
    	addMouseListener(new Mouseclass());
    	
    	
       }     
    
    
    private class Mouseclass extends MouseAdapter{
    //metoda
          public void mouseClicked(MouseEvent event) {
    	        details = String.format("You clicked %d ", event.getClickCount());
    	        if(event.isMetaDown())
    	        		details += "with right mouse button";
    	        else if (event.isAltDown())
    	        		details +="with center mouse button";
    	        else 
    	        		details += "with left mouse button";
    	        statusbar.setText(details);
         }
		
    }
}    
