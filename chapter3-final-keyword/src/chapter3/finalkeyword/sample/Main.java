package chapter3.finalkeyword.sample;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setPrice(12000);
		
		System.out.println("Max price of product is " + product.getMaxPrice());
		System.out.println("Current price of product is " + product.getPrice());
		System.out.println("Current price is greater than max price : " + product.isPriceGreaterThanMaxPrice());
		
	}

}
