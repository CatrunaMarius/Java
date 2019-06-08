import java.io.*;
import java.lang.*;
import java.util.*;
public class createfile {
      
	private Formatter x;
	
	//metoda
	public void openFile() {
		try {
			x = new Formatter("mars2.txt");
			
		}
		catch(Exception e) {
			System.out.println("You have an error");
		}
	}
	public void addRecords() {
		x.format("%s%s%s", "20","marius", "Robert");
	}
	
	public void closeFile() {
		x.close();
	}
}
