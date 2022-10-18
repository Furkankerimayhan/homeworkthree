package interfaces;

public class CustomerManger {
	
	private ICustomerDal customerDal;
	
	
	public CustomerManger(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		//iş kodları yazılır.
		customerDal.Add();
	}
}
