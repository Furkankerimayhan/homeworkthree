package nesne3;

public abstract class BaseCreditManager implements CreditManager{

	@Override
	public abstract void Calculate();
		
	
	@Override
	public void Save() {
		System.out.println("Kaydedildi");
		
	}
	
}
