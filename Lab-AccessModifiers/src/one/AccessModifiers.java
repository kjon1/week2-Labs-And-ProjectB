package one;
import two.ProtectedSubClass;

public class AccessModifiers {
	
	public static void main(String[] args) {
		//access class methods here
		
		Person amad = new Person();
		amad.age = 60;
		System.out.println(amad.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
		
	}

}
