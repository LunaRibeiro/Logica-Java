package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero 
� par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero 
elevado ao quadrado.*/
		
		double num, op;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		num = L.nextDouble();
		
		if (num % 2 == 0) {
			op = Math.sqrt(num);
			System.out.printf("� um n�mero par e a raiz quadrada do mesmo �: %.2f ", op);
		}else if(num % 2 != 0) {
			op = Math.pow(num, 2);
			System.out.printf("� um n�mero �mpar e esse n�mero elevado ao quadrado �: %.2f ",op);
		}
	}

}