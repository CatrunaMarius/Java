public class ArrayStructures {
		
	private int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	public void generateRandomArray(){
		
		for(int i = 0; i < arraySize; i++){
			
			theArray[i] = (int)(Math.random()*10)+10;
			
		}
		
	}
	
	public void printArray(){
		
		System.out.println("----------");
		for(int i = 0; i < arraySize; i++){
			
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			
			System.out.println("----------");
			
		}
		
	}
	
	public int getValueAtIndex(int index){
		
		if(index < arraySize) return theArray[index];
		
		return 0;
		
	}
	
	public boolean doesArrayContainThisValue(int searchValue){
		
		boolean valueInArray = false;
		
		for(int i = 0; i < arraySize; i++){
			
			if(theArray[i] == searchValue){
				
				valueInArray = true;
				
			}
			
		}
		
		return valueInArray;
		
	}
	
	public void deleteIndex(int index){
		
		if(index < arraySize){
			
			for(int i = index; i < (arraySize - 1); i++){
				
				theArray[i] = theArray[i+1];
				
			}
			
			arraySize--;
			
		}
		
	}
	
	public void insertValue(int value){
		
		if(arraySize < 50){
			
			theArray[arraySize] = value;
			
			arraySize++;
			
		}
		
	}
	
	public String linearSearchForValue(int value){
		
		boolean valueInArray = false;
		
		String indexsWithValue = "";
		
		for(int i = 0; i < arraySize; i++){
			
			if(theArray[i] == value){
				
				valueInArray = true;
				
				indexsWithValue+= i + " ";
				
			}
			
			printHorzArray(i, -1);
			
		}
		
		if(!valueInArray){
			
			indexsWithValue = "None";
			
		}
		
		System.out.print("The Value was Found in the Following: " + indexsWithValue);
		
		System.out.println();
		
		return indexsWithValue;
		
	}
	
public void printHorzArray(int i, int j){
		
		for(int n = 0; n < 51; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < arraySize; n++){
			
			System.out.print("| " + n + "  ");
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 51; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < arraySize; n++){
			
			System.out.print("| " + theArray[n] + " ");
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 51; n++)System.out.print("-");
		
		System.out.println();
		
		// SFÂRȘITUL PRIMEI PARTE
		//explicatile de mai sus se gasesc in fisierul algorim
		
		
		// ADĂUGATĂ PENTRU SORTUL BUBBLE
		
		if(j != -1){
		
			// ADĂGAȚI +2 PENTRU FIXAREA SPACINGULUI
			
			for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");
			
			System.out.print(j);
			
		}
		
		
		// Apoi adăugați acest cod
		
		if(i != -1){
			
			// ADĂUGAȚI LIVRAREA -1 DE FIXARE
			
			for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");
			
			System.out.print(i);
			
		}
		
		System.out.println();
		
	}
	
	// Acest tip de balon va sorta totul de la cel mai mic la cel mai mare
		
		public void bubbleSort(){
			
			//încep de la sfârșitul matricei.
            // Pe măsură ce este decrementat, toți indicii mai mari sunt apoi sortați
			
			for(int i = arraySize - 1; i > 1; i--){
				
				// Bucla interioară începe de la începutul matricei și compară fiecare valoare una lângă cealaltă. 
				//Dacă valoarea este mai mare atunci ele sunt schimbate
				
				for(int j = 0; j < i; j++){
					
					// Pentru a schimba sortarea în Modificări descrescătoare la <
					
					if(theArray[j] > theArray[j + 1]){
						
						swapValues(j, j+1);
						
						printHorzArray(i, j);
						
					}
					
				}
				
			}
			
		}
		
		public void swapValues(int indexOne, int indexTwo){
			
			int temp = theArray[indexOne];
			theArray[indexOne] = theArray[indexTwo];
			theArray[indexTwo] = temp;
			
		}
		
		
		// Căutarea binară este mai rapidă decât căutarea liniară deoarece toate valorile sunt sortate. 
        //Deoarece totul este sortat odată ce ajungi la un număr mai mare decât ceea ce căutați puteți opri căutarea. 
		//De asemenea, puteți începe căutarea din mijloc, ceea ce accelerează căutarea. 
		//De asemenea, funcționează cel mai bine atunci când nu există duplicate
		
		public void binarySearchForValue(int value){
			
			int lowIndex = 0;
			int highIndex = arraySize - 1;
			
			while(lowIndex <= highIndex){
				
				int middleIndex = (highIndex + lowIndex) / 2;
				
				if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
				
				else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;
				
				else {
					
					System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
					
					lowIndex = highIndex + 1;
					
				}
				
				printHorzArray(middleIndex, -1);
				
			}
			
		}
		
		// Căutarea de sortare a selecției pentru cel mai mic număr din matrice îl salvează în locația minimă 
		//și apoi repetă căutarea în întreaga matrice de fiecare dată
		
		public void selectionSort(){
			
			for(int x=0; x < arraySize; x++){
				  int minimum = x;
				  
				  for(int y=x; y < arraySize; y++){
				  
					  // Pentru a schimba direcția de sortare, schimbați acest lucru de la> la <

					  
					  if(theArray[minimum]>theArray[y]){
						  minimum = y;
					  }
				  }
				  
				  swapValues(x, minimum);
				  
				  printHorzArray(x, -1);
			}
			
		}
		
		// Sortarea inserției este în mod normal cea mai bună dintre tipurile elementare.
        //Spre deosebire de celelalte tipuri care au avut un grup sortat la un moment dat, grupurile sunt sortate doar parțial aici.
		
		public void insertionSort(){
			
			for (int i = 1; i < arraySize; i++){
				  int j = i;
				  int toInsert = theArray[i];
				  while ((j > 0) && (theArray[j-1] > toInsert)){
					  theArray[j] = theArray[j-1];
					  j--;
					  
					  printHorzArray(i, j);
					  
				  }
				  theArray[j] = toInsert;
				  
				  printHorzArray(i, j);
				  
				  System.out.println("\nArray[i] = " + theArray[i] + " Array[j] = " + theArray[j] + " toInsert = " + toInsert + "\n");
				  
			}
			
		}
	
	public static void main(String[] args){
		
		ArrayStructures newArray = new ArrayStructures();
		
		newArray.generateRandomArray();
		
		newArray.printHorzArray(-1,-1);
		
		// newArray.linearSearchForValue(10);
		
		// newArray.bubbleSort();
		
		// We must Sort first
		
		// newArray.binarySearchForValue(17);
		
		// newArray.selectionSort();
		
		newArray.insertionSort();
		
	}

}
