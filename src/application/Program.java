package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;



public class Program {

	

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = tc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c)?");
			char ch = tc.next().charAt(0);
			
			if(ch == 'i') {
				
				System.out.print("Name: ");
				tc.nextLine();
				String name = tc.nextLine();
				System.out.print("Annual income: ");
				Double annualIncome = tc.nextDouble();
				System.out.print("Health expenditures: ");
				Double healthExpenditures = tc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
				
			}else{
				
				System.out.print("Name: ");
				tc.nextLine();
				String name = tc.nextLine();
				System.out.print("Annual income: ");
				Double annualIncome = tc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmploye = tc.nextInt();
				
				list.add(new Company(name, annualIncome, numberOfEmploye));
				
			}
	
		}
		
		Double sum = 0.0;
		for(TaxPayer taxpayer: list) {
			System.out.println();
			System.out.println("==== Taxes Paid =====");
			System.out.println(String.format(taxpayer.getName()) + String.format(" R$ %.2f ", taxpayer.tax()));
			sum += taxpayer.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: " + String.format(" %.2f ", sum));
			
		tc.close();
	}

}
