import javax.swing.JOptionPane;

class apples{
	public static void main (String[] args) {
		
		String fn = JOptionPane.showInputDialog("Entre first number");
		String sn = JOptionPane.showInputDialog("Entre second number");   	
	    
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1+num2;
		
		JOptionPane.showMessageDialog(null,"The answe is " +sum, "the title", JOptionPane.PLAIN_MESSAGE);
	}
	
}
