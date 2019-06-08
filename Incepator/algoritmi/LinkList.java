class LinkList{
	
	//Trimiteți la prima legătură în listă
	// Ultima legătură a fost adăugată la LinkedList
	
	public Link firstLink; 
	
	LinkList(){
		
		// Aici pentru a arăta prima legătură întotdeauna începe ca null
		
		firstLink = null;
		
	}
	
	// Returnează adevărat dacă LinkList este gol
	
	public boolean isEmpty(){
		
		return(firstLink == null);
		
	}
	
	public void insertFirstLink(String bookName, int millionsSold){
		
		Link newLink = new Link(bookName, millionsSold);
		
		// Conectează câmpul FirstLink la noua legătură
		
		newLink.next = firstLink;
		
		firstLink = newLink;
		
	}
	
	public Link removeFirst(){
		
		Link linkReference = firstLink;
		
		if(!isEmpty()){
		
			// Elimină legătura din listă
		
			firstLink = firstLink.next;
		
		} else {
			
			System.out.println("Empty LinkedList");
			
		}
		
		return linkReference;
		
	}
	
	public void display(){
		
		Link theLink = firstLink;
		
		// Începeți de la referința stocată în FirstLink și continuați să obțineți referințele stocate în următorul rând pentru fiecare Legătură până când următoarea returnă null
		
		while(theLink != null){
			
			theLink.display();
			
			System.out.println("Next Link: " + theLink.next);
			
			theLink = theLink.next;
			
			System.out.println();
			
		}
		
	}
	
	public Link find(String bookName){
		
		Link theLink = firstLink;
		
		if(!isEmpty()){
		
			while(theLink.bookName != bookName){
			
				// Verifică dacă la sfârșitul LinkedList
			
				if(theLink.next == null){
				
					// Am ajuns la sfârșitul legăturilor în LinkedList fără a găsi o potrivire
				
					return null;
				
				} else {
				
					// A găsit o legătură potrivită în LinkedList
				
					theLink = theLink.next;
				
				}
			
			}
			
		} else {
			
			System.out.println("Empty LinkedList");
			
		}
		
		return theLink;
		
	}
	
	public Link removeLink(String bookName){
		
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		// Păstrați căutarea atâta timp cât nu se efectuează un meci
		
		while(currentLink.bookName != bookName){
			
			// Verificați dacă la ultima legătură din LinkedList
			
			if(currentLink.next == null){
				
				// bookName nu a fost găsit astfel lăsați metoda
				
				return null; 
				
			} else {
				
				// Am verificat aici, așa că să ne uităm în următorul link din listă
				
				previousLink = currentLink; 
				
				currentLink = currentLink.next;
				
			}
			
		}
		
		if(currentLink == firstLink){
			
			// Dacă sunteți aici, înseamnă că a existat o potrivire în referința stocată în FirstLink în LinkedList astfel încât să alocați doar lângă firstLink
			
			firstLink = firstLink.next;
			
		} else {
			
			// Dacă sunteți aici, există o potrivire într-o legătură diferită de prima legătură. Atribuiți valoarea următoare pentru linkul pe care doriți să îl ștergeți la linkul care urmează în continuare, indicat anterior referinței de eliminat
			
			System.out.println("FOUND A MATCH");
			System.out.println("currentLink: " + currentLink);
			System.out.println("firstLink: " + firstLink);
			
			previousLink.next = currentLink.next;
			
		}
		
		return currentLink;
		
	}
	
}
