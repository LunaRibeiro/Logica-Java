package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.

		int n1, n2, n3, maior;
		maior = 0;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		n1 = L.nextInt();

		System.out.println("Informe um número: ");
		n2 = L.nextInt();

		System.out.println("Informe um número: ");
		n3 = L.nextInt();
		
		if(n1 > n2) {		//ve se o n1 é maior que n2
			maior = n1;
		}else if(n2 > n1 && n2 > n3) {	//compara se o n2 é maior que os outros dois numeros
			maior = n2;
		}else {
			maior = n3;	//se nenhuma das anterios for maior, então o maior é o terceiro numero
		}
		System.out.println("O maior número é: "+maior);	
	}
}
