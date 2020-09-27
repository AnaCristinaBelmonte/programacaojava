package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee_lista;

public class exerc_lista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee_lista> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered?");
		int N = sc.nextInt();
				
		for (int i=0; i<N; i++ ) {
			
			System.out.println("Employee #"+(i+ 1) +":");
			System.out.print("Id:");
			Integer id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			
			Employee_lista emp = new Employee_lista(id,name,salary);
			
			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int idsalary = sc.nextInt();
		Integer pos = position(list,idsalary);
		if (pos==null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage:");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employess:");
		
		for (Employee_lista emp: list) {
			System.out.println(emp);
		}
				
		sc.close();

	}
	
	public static Integer position(List<Employee_lista> list, int id) {
		for (int i = 0; i <list.size(); i++) {
			if (list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}

}
