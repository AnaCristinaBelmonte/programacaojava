package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class exerc3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student stud = new Student();
	    stud.aluno = sc.nextLine();
	    stud.n1 = sc.nextDouble();
	    stud.n2 = sc.nextDouble();	   
	    stud.n3 = sc.nextDouble();
	   
	    System.out.printf("FINAL GRADE =%.2f%n", stud.notaFinal());
	    
	    if (stud.notaFinal() < 60) {
	    	System.out.println("FAILED");	
    		System.out.printf("MISSING %.2f%n POINTS%n", stud.faltounota());
	    	
	    } else {
	    	System.out.println("PASS");
    		
	    }
	    				
		sc.close();

	}

}
