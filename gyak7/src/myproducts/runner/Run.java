package myproducts.runner;

import myproducts.Product;
import myproducts.Bread;

public class Run {

	public static void main(String[] args) {
		Product product = new Product("Hello Kitty Doll", 1000, 27);
		Bread bread = new Bread("Vitajo", 500, 27, 0.5);
		System.out.println(product);
		System.out.println(bread);
		int tmp = bread.cmpGrossPrices(product);
		System.out.println(tmp);
		int tmp2 = product.cmpGrossPrices(bread);
		System.out.println(tmp2);
		
		Object o = new Object();
		Object o2 = new Bread("occo", 1, 27, 0.6);
		Product product2 = new Product("ccc", 250, 22);
		// ((Bread)product2).getAmount();
		System.out.println(product2 instanceof Bread);
		System.out.println(product2 instanceof Product);
	}

}
