package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

		int n1, n2, n3, maior;
		maior = 0;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		n1 = L.nextInt();

		System.out.println("Informe um n�mero: ");
		n2 = L.nextInt();

		System.out.println("Informe um n�mero: ");
		n3 = L.nextInt();
		
		if(n1 > n2) {		//ve se o n1 � maior que n2
			maior = n1;
		}else if(n2 > n1 && n2 > n3) {	//compara se o n2 � maior que os outros dois numeros
			maior = n2;
		}else {
			maior = n3;	//se nenhuma das anterios for maior, ent�o o maior � o terceiro numero
		}
		System.out.println("O maior n�mero �: "+maior);	
	}
}
