package apples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class GUi extends JFrame {
    private JPanel mousepanel; 
    private JLabel statusbar;   
   
    //construnctor
    public GUi () {
    	super("The title"); //numele ferestei
    	
    	
    	mousepanel = new JPanel();
    	mousepanel.setBackground(Color.WHITE); //setare culoare
    	add(mousepanel, BorderLayout.CENTER);  // am adaugato in ferestei
    	
    	statusbar = new JLabel("default"); //statusul barei
    	add(statusbar, BorderLayout.SOUTH); //
    			
    	Handlerclass handler = new Handlerclass();
    	mousepanel.addMouseListener(handler);
    	mousepanel.addMouseMotionListener(handler);
       }     
    
    
    private class Handlerclass implements MouseListener, MouseMotionListener{
    //metodele
    	//MouseListener
    	//cand dai click
    	public void mouseClicked(MouseEvent event) {
    		  statusbar.setText(String.format("Clicked at %d,%d", event.getX(), event.getY()));
    	  }
    	//cand apesi pe butonul de la mouse
    	  public void mousePressed(MouseEvent event) {
    		  statusbar.setText("You pressed down the mouse");
    	  }
    	  // cand eliberezi butonul de la mouse
    	  public void mouseReleased(MouseEvent event) {
    		  statusbar.setText("You released the button");
    	  }
    	  // cand mousul intra in aria mousepanel
    	  public void mouseEntered(MouseEvent event) {
    		  statusbar.setText("You entered the area");
    		  mousepanel.setBackground(Color.RED);//schimba culoarea ariei
    	  }
    	  //cand mousul iese din fereastara
    	  public void mouseExited(MouseEvent event) {
    		  statusbar.setText("The mouse has left he window");
    		  mousepanel.setBackground(Color.WHITE);//schimba culoare ariei
    		 }
    	  
    	  //acestea sunt un eveniment de mișcare a mouse-ului
    	  //MouseMotionListener
    	  public void mouseDragged(MouseEvent event) {
    		  statusbar.setText("You are dragging the mouse");
    	  }
    	  
    	  public void mouseMoved(MouseEvent event) {
    		  statusbar.setText("You moved the mouse");
    	  }
		
		
    }
}   
