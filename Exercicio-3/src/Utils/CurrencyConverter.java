package Utils;

public class CurrencyConverter {
	public static final double TAX = 0.06;

	public static double convert(double price, double quantity){
		double value = price * quantity;
		return value + (value * TAX);
	}

}
