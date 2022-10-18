package kodlamaİO.entities.Concreate;

public class Kurs {
	private int id;
	private String name;
	private double price;
	
	public Kurs(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Kurs() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
