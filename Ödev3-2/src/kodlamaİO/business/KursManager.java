package kodlamaİO.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaİO.core.logging.Logger;

import kodlamaİO.entities.Concreate.Kurs;

public class KursManager {
	private kodlamaİO.dataAccess.kursDataAccess.KursDao _kursDao;
	private Logger[] loggers;
	
	public KursManager(kodlamaİO.dataAccess.kursDataAccess.KursDao _kursDao, Logger[] loggers) {
		this._kursDao = _kursDao;
		this.loggers = loggers;
	}
	List<Kurs> kurslar = new ArrayList<>();

	public void Add(Kurs kurs)throws Exception{
		for (Kurs k : kurslar) {
			if(k.getName()==kurs.getName()) {
				throw new Exception("Kurs ismi mevcuttut");
			}
		}
		if (kurs.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}
		_kursDao.add(kurs);
		for (Logger i : loggers) {
			i.log(kurs.getName());
		}
	}
	
}
