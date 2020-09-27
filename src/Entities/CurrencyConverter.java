package Entities;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double paid(double dolar, double valor) {
		return valor * dolar * (1.0 + IOF);
	}

}
