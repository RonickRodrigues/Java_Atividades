package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		
		System.out.println("Nome do Aluno: ");
		a1.nome = sc.nextLine();
		System.out.println("Nota do primeiro trimestre: ");
		a1.nota1 = sc.nextDouble();
		System.out.println("Nota do segundo trimestre: ");
		a1.nota2 = sc.nextDouble();
		System.out.println("Nota do terceiro trimestre: ");
		a1.nota3 = sc.nextDouble();
		
		a1.soma();
		System.out.println(a1.resultado(a1.soma()));
		
		sc.close();
		
	}

}
