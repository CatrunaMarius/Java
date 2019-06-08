
public class MainClass {
	public static void main(String[] args) {
		
		//Person A;//este un obiect
		Person A = new Person(24, "Marius");//aici l-am initializat/instanta a functiei
		Person B=new Person();

		System.out.println("This person "+ A.fname+" has "+A.age+" years old");
		System.out.println(A);//aici printeaza adresa din memoria de referinta in care se afla daca nu vrem sa avem aceasta problem vom crea o noua functie in clasa person
		System.out.println(B);
		
	
	
	}

}
