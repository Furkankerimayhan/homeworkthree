package kodlamaİO.dataAccess.kursDataAccess;

import kodlamaİO.entities.Concreate.Kurs;

public class Jdbc implements KursDao{

	@Override
	public void add(Kurs kurs) {
		System.out.println("Jdbc ile eklendi");
	}
	
}
