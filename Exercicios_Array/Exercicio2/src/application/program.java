package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/
		
		
		int[] num = new int[6];
		int soma = 0;
		int cont = 0;
		
		Scanner L = new Scanner(System.in);
		
		for(int x = 0; x < 6; x++) {
			System.out.println("Informe um n�mero: ");
			num[x] = L.nextInt(); //preenche todas as posi��es do vetor
			
			if(num[x] % 2 == 0) {
				soma += num[x];	//soma os numeros pares
			}else {
				cont++;	//conta quantos numeros impares tem
			}
		}
		
		for (int x = 0; x < 6; x++) {
			if (num[x] % 2 == 0) {	//mostra somente os numeros pares
				System.out.println("Os n�meros pares s�o: "+num[x]);
			}
		}
		
		System.out.println("\n");
		
		for (int x = 0; x < 6; x++) {
			if (num[x] % 2 != 0) {	//mostra somente os numeros impares
				System.out.println("Os n�meros �mpares s�o: "+num[x]);
			}
		}
		
		System.out.println("\n");
		
		System.out.println("A soma dos n�meros pares digitados �: "+soma);
		System.out.println("A soma dos n�meros �mpares digitados �: "+cont);

	}

}