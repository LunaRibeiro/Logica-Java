package application;

import java.util.Scanner;

//Exercicio 6 - tem raiz quadrada

public class program {

	public static void main(String[] args) {
		double x1, y1, x2, y2, d;				
		//r = raiz
		//pot = potencia
		//d = distancia 
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe as coordenadas do Ponto 1 (X,Y):");
		x1 = L.nextDouble();
		y1 = L.nextDouble();
		System.out.println("Informe as coordenadas do Ponto 2 (X,Y):");
		x2 = L.nextDouble();
		y2 = L.nextDouble();
		
		d = Math.sqrt((Math.pow((x2 - x1), 2))+(Math.pow(y2-y1, 2)));
	
		System.out.printf("O resultado é: %.2f ",d);
		
	}

}