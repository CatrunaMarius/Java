package apples;

import java.io.File;

class apples{
    public static void main (String [] args){
       
    	    File x = new File("C:\\Users\\Harum\\Desktop\\mars1.txt");
    	   
    	    //verifica daca exista sau nu exista fisierul cauta in respectivul dosar
    	    if(x.exists())
    	    	System.out.println(x.getName() + " exist!");
    	    else
    	    	System.out.println("this thing dosen't exists");
    	    
    	    
       }
}
