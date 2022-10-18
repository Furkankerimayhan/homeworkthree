package abstractClasses;
//Abstract bir sınıfın abstract olabilmesi için abstract imzası ile beslenmesi gerkiyor.
//Operasyonun abstract olabilmesi için yine abstractla beslenmesi gerekiyor.
public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
