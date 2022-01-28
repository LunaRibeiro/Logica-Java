package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Escrever um programa que receba vários números inteiros no teclado. 
E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

		int num = 0, media = 0, cont = 0, total = 0;
		
		Scanner L = new Scanner(System.in);
		
		do{
			System.out.println("Informe um número inteiro: ");
			num = L.nextInt();
			
			if (num%3 == 0 && num !=0) {
				media += num; //media = media + num
				cont++;
			}
			
		}while(num != 0);
		
		total = media/cont;
		
		System.out.println("A média dos múltiplos de 3 é "+total);
	}

}