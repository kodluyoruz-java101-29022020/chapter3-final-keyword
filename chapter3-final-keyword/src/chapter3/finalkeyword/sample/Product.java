package chapter3.finalkeyword.sample;

public class Product {

	// "final" değişkenlere değer ataması bir kez yapılabilir.
	// Burada olduğu gibi tanımlar tanımlamaz değer ataması yapabiliyoruz.
	protected final long maxPrice = 1000000;
	
	// Ya da ilk değer atamasını kurucu metot içinde değer atayabiliriz.
	// private final long maxPrice;
	
	
	protected long price;

	public Product() {
		// maxPrice = 1000000;
	}
	
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getMaxPrice() {
		return maxPrice;
	}
	
	// Bir metot final ile tanımlanmışsa, bu metoda override (ezme) işlemi uygulanamaz.
	// Product sınıfından kalıtım almış olan Computer alt sınıfında bu metodu override edemeyiz.
	public final boolean isPriceGreaterThanMaxPrice() {
		
		return price > maxPrice;
	}
}
