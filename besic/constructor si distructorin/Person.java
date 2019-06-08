
public class Person {
//am atribuit 3 variabile aceste persoane
	int age;
	String fname;
	String lname;
	

	//constructor defull
	Person(){
		age = 20;
		fname="unkown";
		lname= null;
		}
			
	
	//constructor. acestea se folosec pentru initializarea inca de la inceput
	Person(int age, String fname){
		this.age =age;//this se refera la valoare din cadrul clasei folosim this pentru a distinge intre ele
		this.fname =fname;
	}
	
	//construnctor
	Person(int age,String fname, String lname){
		this.age =age;
		this.fname =fname;
		this.lname=lname;
	}
	
	public String toString() {
	      return "This  person's name is: " +this.fname + " "+ this.lname+" and he/she is " +this.age+" years old";
	}
	
}
