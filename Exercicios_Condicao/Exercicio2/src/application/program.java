package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

		float n1, n2, n3, maior;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		n1 = L.nextFloat();

		System.out.println("Informe um n�mero: ");
		n2 = L.nextFloat();

		System.out.println("Informe um n�mero: ");
		n3 = L.nextFloat();
	
		if (n1 <= n2 && n2 <= n3) {							//por ter 3 n�meros - 3! = 6 combina��es
			System.out.printf("A ordem crescente �\n %.2f \n %.2f \n %.2f", n1, n2, n3);
		}else if (n1 <= n3 && n3 <= n2) {
			System.out.printf("A ordem crescente �:\n %.2f \n %.2f \n %.2f", n1, n3, n2);
		}else if (n2 <= n1 && n1 <= n3){
			System.out.printf("A ordem crescente �:\n %.2f \n %.2f \n %.2f", n2, n1, n3 );
		}else if (n2 <= n3 && n3 <= n1) {
			System.out.printf("A ordem crescente �:\n %.2f \n %.2f \n %.2f", n2, n3, n1);
		}else if(n3 <= n1 && n1 <= n2) {
			System.out.printf("A ordem crescente �:\n %.2f \n %.2f \n %.2f", n3, n1, n2);
		}else {
			System.out.printf("A ordem crescente �: \n %.2f \n %.2f \n %.2f", n3, n2, n1);
		}
	}
}