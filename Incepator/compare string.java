import java.awt.Color;

import javax.swing.*;



class apples{
	public static void main (String[] args) {
		
		String a = "apples";
		String b = "Marius";
		String c = "marius";
		
		System.out.println(a.length());
		
		if (a.equals("apples")) {
			System.out.println("It eguals apples!");
		}
		if(b.equalsIgnoreCase(c)) {
			System.out.println("marius match");
		}
		
	}
	
}
