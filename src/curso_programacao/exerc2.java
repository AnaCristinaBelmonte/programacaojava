package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;


public class exerc2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross SAlary: ");
        employee.grossSalary= sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.print("Name:" + employee.name +", $"+ employee.netSalary(employee.grossSalary));
        System.out.println();
        System.out.print("Which percentage to increase salary?");
        double percent = sc.nextDouble();
       
        
        System.out.println();
        System.out.println("Updated data: " + employee.name +", $"+  employee.increaseSalary(percent));
        
        sc.close();

	}

}
