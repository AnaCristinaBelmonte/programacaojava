package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import Entities.banco;

public class exer_construtores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		banco banco;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
	
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
				
		System.out.print("Is there na initial deposit:(y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') { 
			System.out.print("Enter initial deposit value: ");
			double valorIni = sc.nextDouble();
			banco = new banco(number, holder, valorIni);
		}
		else {
			banco = new banco(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(banco.ToString());
		
		sc.nextLine();
		System.out.println();
		System.out.print("Enter a deposit value:");
		double depositovalue = sc.nextDouble();
		banco.deposito(depositovalue);
		System.out.println("Updated account data:");
		System.out.println(banco.ToString());
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double saque = sc.nextDouble();
		banco.withdraw(saque);
		System.out.println("Updated account data:");
		System.out.println(banco.ToString());
		
		sc.close();
	}

}
