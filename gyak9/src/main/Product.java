package main;

public class Product {
	private String name;
	private int netPrice;
	private int aKey;
		
	public Product(String name, int netPrice, int aKey) {
		super();
		this.name = name;
		this.netPrice = netPrice;
		this.aKey = aKey;
	}
	
	public int grossPrice() {
		double multiplier = ((double)aKey / 100) + 1;
		return (int)(netPrice * multiplier);
	}
	
	public void raisePrice(int raisePercent) {
		double multiplier = ((double)raisePercent / 100) + 1;
		netPrice *= multiplier;
	}
	
	public int cmpGrossPrices(Product product) {
		if (this.grossPrice() > product.grossPrice()) {
			return 1;
		} else if (this.grossPrice() < product.grossPrice()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return name + " - " + grossPrice();
	}
}
