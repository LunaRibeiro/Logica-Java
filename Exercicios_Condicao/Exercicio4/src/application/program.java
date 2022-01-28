package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número 
é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número 
elevado ao quadrado.*/
		
		double num, op;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num = L.nextDouble();
		
		if (num % 2 == 0) {
			op = Math.sqrt(num);
			System.out.printf("É um número par e a raiz quadrada do mesmo é: %.2f ", op);
		}else if(num % 2 != 0) {
			op = Math.pow(num, 2);
			System.out.printf("É um número ímpar e esse número elevado ao quadrado é: %.2f ",op);
		}
	}

}