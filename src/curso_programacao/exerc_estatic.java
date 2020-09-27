package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import Entities.CurrencyConverter;

public class exerc_estatic {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double valor = sc.nextDouble();
		double result = CurrencyConverter.paid(dolar, valor);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();

	}

}
