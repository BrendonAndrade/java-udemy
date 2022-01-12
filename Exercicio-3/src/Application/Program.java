package Application;

import Utils.CurrencyConverter;

public class Program {
	public static void main(String[] args){
		double dolarPrice = 3.10;
		double quantity = 200.00;

		double value = CurrencyConverter.convert(dolarPrice, quantity);
		System.out.println("Amount to be paid in Reais = " + value);
	}
}
