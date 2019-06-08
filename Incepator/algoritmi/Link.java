public class Link {

	// Stabiliți publicului, deci nu sunt necesare astfel de getters & setters
	
	public String bookName;
	public int millionsSold;
	
	// Trimiteți la următorul link făcut în LinkList
	// Menține referința la linkul care a fost creat înainte de el
	// Setați la zero până când acesta este conectat la alte linkuri
	
	public Link next; 
	
	public Link(String bookName, int millionsSold){
		
		this.bookName = bookName;
		this.millionsSold = millionsSold;
		
	}
	
	public void display(){
		
		System.out.println(bookName + ": " + millionsSold + ",000,000 Sold");
		
	}
	
	public String toString(){
		
		return bookName;
		
	}
	
	public static void main(String[] args) {
		
		LinkList theLinkedList = new LinkList();
		
		// Inserați linkul și adăugați o referință la link-ul de carte adăugat chiar înaintea câmpului următor
		
		theLinkedList.insertFirstLink("Don Quixote", 500);
		theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
		theLinkedList.insertFirstLink("The Lord of the Rings", 150);
		theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);
		
		theLinkedList.display();
		
		System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");
		
		// Elimină ultima legătură introdusă
		
		theLinkedList.removeFirst();
		
		theLinkedList.display();
		
		System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found");
		
		theLinkedList.removeLink("A Tale of Two Cities");
		
		System.out.println("\nA Tale of Two Cities Removed\n");
		
		theLinkedList.display();
		
	}
	
}
