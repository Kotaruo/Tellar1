import puntoCinco.Student;
import puntoSiete.person;

public class Principal {

	public static void main(String[] args) {
		
		// crear un objecto de tipo Student con la siguiente intaxis
		//primero coloco el tipo de dato del nombre del objeto , despues el nombre del objeto
		// luego el signo igual , despues la palabra new y por ultimo el constructor de la clase
		
		Student st = new Student();
		System.out.println(st.name + "\n" +  st.id + "\n" + st.status );
	}


	
public static void puntoSiete() {
	
	person p1 = new person(37,"arial");
	person P2 = new person(15,"Joseph");
	
	if(p1.getAge() == P2.getAge()) {
		System.out.println(p1.getName() +" tiene el mismo nombre que "+P2.getName());
	
	}
	else {
		System.out.println(p1.getName() + "no tienen el mismo nombre" + P2.getName());
		
	}
}	
}


