package kodlamaİO.dataAccess.kursDataAccess;

import kodlamaİO.entities.Concreate.Kurs;

public class Hibernate implements KursDao{

	public void add(Kurs kurs) {
		System.out.println("Hibernate ile eklendi");
		
	}
	
}
