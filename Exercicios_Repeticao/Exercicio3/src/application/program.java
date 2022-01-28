package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		
		int idade, cont21 = 0, cont50 = 0;
		
		Scanner L = new Scanner(System.in);
		System.out.println("Informe  sua idade: ");
		idade = L.nextInt();
		while(idade != -99) {
			
			if(idade < 21) {
				cont21++;
			}else if(idade > 50) {
				cont50++;
			}
			System.out.println("Informe  sua idade(Digite -99 para parar!): ");
			idade = L.nextInt();
		}
		System.out.println("O total de pessoas com menos de 21 é "+cont21);
		System.out.println("O total de pessoas com mais de 50 é "+cont50);
	}

}