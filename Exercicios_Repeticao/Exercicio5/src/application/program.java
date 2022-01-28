package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
No final, mostre a soma dos números digitados.(DO...WHILE)*/
		int soma = 0, num;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe um número do teclado");
		do {
			
			num = L.nextInt();
			
			soma += num;
			
		}while(num != 0);
		System.out.println("A soma de todos os números é "+soma);
	}

}
