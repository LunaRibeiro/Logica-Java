package application;

import java.util.Scanner;

/*Escreva  um sistema que leia tr�s n�meros 
inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
D = R+S/2		onde, R = (A + B) ao quadrado
				 S = (B + C) ao quadrado
*/

public class program {

	public static void main(String[] args) {
		double A, B, C, D, R, S;
		
		Scanner L = new Scanner(System.in);
	
		System.out.println("Informe um n�mero inteiro e positivo: ");
		A = L.nextDouble();
		
		System.out.println("Informe um n�mero inteiro e positivo: ");
		B = L.nextDouble();
		
		System.out.println("Informe um n�mero inteiro e positivo: ");
		C = L.nextDouble();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		
		D = ((R+S)/2);
		
		System.out.println("O resultado �: "+D);

	}

}
