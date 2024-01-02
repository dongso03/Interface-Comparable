public interface IPizza {
	public static final int PEPPRONI_PRICE = 12000;
	public static final int BACON_PRICE = 10000;
	public static final int ONE_PEP = 500;
	public static final int ONE_BA = 100;

	public int getPrice();
}

abstract class Pizza implements IPizza, Comparable<Pizza> {
	protected final int defaultPrice;

	public Pizza(int price) {
		defaultPrice = price;
	}

	@Override
	public int compareTo(Pizza o) {
		return this.getPrice() - o.getPrice();
	}

}

class PepperoniPizza extends Pizza {

	private int amountPep;

	public PepperoniPizza(int amountPep) {
		super(PEPPRONI_PRICE);
		this.amountPep = amountPep;
	}

	@Override
	public int getPrice() {
		return defaultPrice + amountPep * ONE_PEP;
	}

}

class BaconPizza extends Pizza {

	private final int defaultPrice = BACON_PRICE;
	private int amountBa;

	@Override
	public int getPrice() {
		return defaultPrice + amountBa * ONE_BA;
	}

	public BaconPizza(int amountBa) {
		super(BACON_PRICE);
		this.amountBa = amountBa;
	}

}
