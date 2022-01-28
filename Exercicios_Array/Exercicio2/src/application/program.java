package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/
		
		
		int[] num = new int[6];
		int soma = 0;
		int cont = 0;
		
		Scanner L = new Scanner(System.in);
		
		for(int x = 0; x < 6; x++) {
			System.out.println("Informe um número: ");
			num[x] = L.nextInt(); //preenche todas as posições do vetor
			
			if(num[x] % 2 == 0) {
				soma += num[x];	//soma os numeros pares
			}else {
				cont++;	//conta quantos numeros impares tem
			}
		}
		
		for (int x = 0; x < 6; x++) {
			if (num[x] % 2 == 0) {	//mostra somente os numeros pares
				System.out.println("Os números pares são: "+num[x]);
			}
		}
		
		System.out.println("\n");
		
		for (int x = 0; x < 6; x++) {
			if (num[x] % 2 != 0) {	//mostra somente os numeros impares
				System.out.println("Os números ímpares são: "+num[x]);
			}
		}
		
		System.out.println("\n");
		
		System.out.println("A soma dos números pares digitados é: "+soma);
		System.out.println("A soma dos números ímpares digitados é: "+cont);

	}

}