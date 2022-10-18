package polymorphisim;

public class Main {

	public static void main(String[] args) {
		/*BaseLogger[] loggers = new BaseLogger[]{new BaseLogger(), new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
		for (BaseLogger logger:loggers) {
			logger.log("Log mesaji");
		}*/
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
		
	}

}
