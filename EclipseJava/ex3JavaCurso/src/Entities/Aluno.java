package Entities;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double soma() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public String resultado(double soma) {
		if(soma > 60) {
			return "FINAL GRADE = " + String.format("%.2f%nPASS", soma);
		}
		else {
			double miss = 60 - soma;
			return "FINAL GRADE = " + String.format("%.2f%nFAILED%nMISSING %.2f POINTS", soma, miss);
		}
	}
}
