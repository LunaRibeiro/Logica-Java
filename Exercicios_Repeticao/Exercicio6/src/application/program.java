package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

		int num = 0, media = 0, cont = 0, total = 0;
		
		Scanner L = new Scanner(System.in);
		
		do{
			System.out.println("Informe um n�mero inteiro: ");
			num = L.nextInt();
			
			if (num%3 == 0 && num !=0) {
				media += num; //media = media + num
				cont++;
			}
			
		}while(num != 0);
		
		total = media/cont;
		
		System.out.println("A m�dia dos m�ltiplos de 3 � "+total);
	}

}