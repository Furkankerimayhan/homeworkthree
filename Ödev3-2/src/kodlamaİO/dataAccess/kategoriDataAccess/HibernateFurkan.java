package kodlamaİO.dataAccess.kategoriDataAccess;

import kodlamaİO.entities.Concreate.Kategori;

public class HibernateFurkan implements KatergoriDao{

	public void Add(Kategori kategori) {
		System.out.println("Hibernate ile güncellendi");
		
	}
}
