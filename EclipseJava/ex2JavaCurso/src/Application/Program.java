package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		
		System.out.print("Name: ");
		e1.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		e1.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		e1.tax = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Employee: " + e1);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		e1.increaseSalary(percentage);
		
		System.out.println();
		System.out.printf("Updaded data: " + e1);
		
		sc.close();

	}

}
