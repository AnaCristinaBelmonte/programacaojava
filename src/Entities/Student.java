package Entities;

public class Student {

	public String aluno;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
    }
	public double faltounota(){
		if (notaFinal() < 60) { 
			return 60 - notaFinal();
		}
		else {
			return 0;	
		}
	}
}