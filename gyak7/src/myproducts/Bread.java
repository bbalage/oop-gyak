package myproducts;

public class Bread extends Product {
	
	private double amount;

	public Bread(String name, int netPrice, int aKey, double amount) {
		super(name, netPrice, aKey);
		this.amount = amount;
	}
	
	public double calcUnitPrice() {
		return super.grossPrice() / amount;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + calcUnitPrice();
	}

	public double getAmount() {
		return amount;
	}
	
	public static boolean cmpUnitPrices(Bread bread1, Bread bread2) {
		return bread1.calcUnitPrice() > bread2.calcUnitPrice();
	}
}
