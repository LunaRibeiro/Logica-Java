package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		int[][] matriz = new int[3][3];
		int cont = 0;
		
		Scanner L = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Informe um número: ");
				matriz[i][j] = L.nextInt();	//pega os valores
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if (matriz[i][j] > 10) {
					cont++;		//conta quantos valores são maiores de 10
				}
			}
		}
		System.out.println("O total de números maiores que 10 é: "+cont);
		
		
	}

}