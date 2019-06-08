import javax.swing.JFrame;



class apples{
	public static void main (String[] args) {
		
		JFrame go = new JFrame("Title");
		Peach p = new Peach();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.add(p);
		go.setSize(300,200);
		go.setVisible(true);
		
		
	}
	
}
