package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
		int soma = 0, num;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe um n�mero do teclado");
		do {
			
			num = L.nextInt();
			
			soma += num;
			
		}while(num != 0);
		System.out.println("A soma de todos os n�meros � "+soma);
	}

}
