package nesneYönelimliProgramlama;

public class Main {
	public static void main(String[] args) {
		CreditManager creditmanager = new CreditManager();
		creditmanager.Calculate();
		creditmanager.Save();
		
		Customer customer = new Customer();  //Örneğini oluşturmak, instance oluşturmak, instance creation
		customer.Id = 1;
		customer.City = "Sakarya";
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.TaxNumber = "10000";
		company.CompanyName = "Ayhanlar";
		company.Id = 100;
		
		Person person = new Person();
		person.FirstName = "Furkan";
		person.LastName = "Ayhan";
		person.NationalIdentity="123456";
		
		System.out.println();
	}
}
