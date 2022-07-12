package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite os dados do "+ (i+1) + "o contribuinte:");
			System.out.print("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double serviceIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double health = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double education = sc.nextDouble();
			System.out.println();
			
			TaxPayer tax = new TaxPayer(salaryIncome, serviceIncome, capitalIncome, health, education);
			list.add(tax);
		}

		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Resumo do "+ (i+1) + "o contribuinte:");
			
			System.out.printf("Imposto bruto total: %.2f%n", list.get(i).getGrossTax());
			System.out.printf("Abatimento: %.2f%n", list.get(i).getTaxRebate());	
			System.out.printf("Imposto devido: %.2f%n", list.get(i).getNetTax());
		}
		
				
		
		
		sc.close();
	}

}
