package kodlamaİO;

import kodlamaİO.business.KursManager;
import kodlamaİO.core.logging.DataBaseLogger;
import kodlamaİO.core.logging.FileLogger;
import kodlamaİO.core.logging.Logger;
import kodlamaİO.dataAccess.kursDataAccess.Hibernate;
import kodlamaİO.entities.Concreate.Kurs;

public class Main {

	public static void main(String[] args)throws Exception {
		Kurs kurs = new Kurs(1,"javaPrograming",2312653);	
		Logger[] loggers = {new DataBaseLogger(), new FileLogger()};
		
		KursManager kursManager = new KursManager(new Hibernate(), loggers);
		kursManager.Add(kurs);
	}

}
