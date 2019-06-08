public class ArrayStructures {
	
	private int[] theArray = new int[50]; // Creează o matrice cu 50 de indici
	
	private int arraySize = 10; // Elemente din Array
	
	
	// Umple matricea cu valori aleatorii
	
	public void generateRandomArray(){
		
		for(int i = 0; i < arraySize; i++){
			
			// Numărul aleatoriu de la 10 la 19
			
			theArray[i] = (int)(Math.random()*10)+10;
			
		}
		
	}
