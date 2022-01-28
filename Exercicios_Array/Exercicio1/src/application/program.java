package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e 
A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
		
		int[] A = new int[6];
//declaração vetor		//declaração posição
		int soma = 0;
		
		Scanner L = new Scanner(System.in);
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;		//atribuição das posições
		A[4] = -5;
		A[5] = 7;
		//soma das posições
		soma = A[0]+A[1]+A[5];
		//mostrar a soma
		System.out.println("\nA soma das posições 0, 1 e 5 é: "+soma);
		//trocar o valor da posição 4
		A[4] = 100;
		System.out.println("O novo valor da posição 4 é: "+A[4]);
		
		//mostrar o vetor inteiro na tela
		for(int x = 0; x < 6; x++) {
			System.out.println("Os valores do vetor são: "+A[x]+"\n");
		}
	}

}