package kodlamaİO.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaİO.core.logging.Logger;
import kodlamaİO.dataAccess.kategoriDataAccess.KatergoriDao;
import kodlamaİO.entities.Concreate.Kategori;

public class KategoriManager {
	private KatergoriDao kategoriDao;
	private Logger[] loggers;
	public KategoriManager(KatergoriDao kategoriDao, Logger[] loggers) {
		this.kategoriDao = kategoriDao;
		this.loggers = loggers;
	}
	List<Kategori> kategoriler = new ArrayList<>();
	public void Add(Kategori kategori) throws Exception{
		for (Kategori k : kategoriler) {
			if (k.getName()==kategori.getName()) {
				throw new Exception("Kategori adı aynı olamaz");
			}
		}
		kategoriDao.Add(kategori);
		for (Logger logger : loggers) {
			logger.log(kategori.getName());
		}
	}
}
