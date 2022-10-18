package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManger customerManger = new CustomerManger(new MySqlCustomerDal());
		customerManger.add();
		
		
	}

}
