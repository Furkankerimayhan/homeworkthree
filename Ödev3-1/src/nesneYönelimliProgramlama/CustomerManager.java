package nesneYönelimliProgramlama;

public class CustomerManager{
	private Customer _customer;
	public CustomerManager(Customer customer) {
		_customer= customer;
	}
	public void Save() {
		System.out.println("Musteri kaydedildi : "+ _customer.Id);
	}
	public void Delete() {
		System.out.println("Musteri silindi : "+ _customer.City);
	}
}
