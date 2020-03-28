package chapter3.finalkeyword.sample;

// Bir sınıfı final olarak tanımlarsak bu sınıftan hiç bir sınıf kalıtım alamayacaktır.
public final class Computer extends Product {

	// Alt sınıfta bu metodu override etmenize izin vermeyecektir.
	@Override
	public boolean isPriceGreaterThanMaxPrice() {
		
		return super.price > super.maxPrice;
	}
}
