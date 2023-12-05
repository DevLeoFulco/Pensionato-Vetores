package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent [] vet = new Rent[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome :");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email :");
			String email = sc.next();
			System.out.print("Quarto :");
			int numeroQuarto = sc.nextInt();
			
			vet [numeroQuarto]= new Rent(nome,email);
		}
		System.out.println();
		System.out.println("Quartos ocupados");
		
		for (int i=0;i<10;i++) {
			if (vet[i]!=null) {
				System.out.println(i + ": "+ vet[i]);
			}
			
			
		}
		
		
		
		sc.close();

	}

}
