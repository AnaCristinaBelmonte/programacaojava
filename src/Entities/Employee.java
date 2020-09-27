package Entities;

public class Employee {

		public String name;
		public double grossSalary;
		public double tax;
		
		public double netSalary (double grossSalary) {
		 return	grossSalary - tax;
		}
		
		public double increaseSalary (double percentage) {
			return grossSalary += grossSalary * percentage/100;
		}

		
}
