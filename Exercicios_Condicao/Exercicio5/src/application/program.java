package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Fa�a um programa que mostre um Menu com op��es de um card�pio de restaurante para uma pessoa. 
A pessoa vai escolher o prato desejado: 
Ap�s escolher o prato, o programa dever� fazer uma pergunta ao usu�rio, se ele aceita pagar a 
gorjeta do gar�om 10% sobre o valor do prato. Se o usu�rio aceitar, mostrar o valor final 
(valor do prato + 10%), caso contr�rio, mostrar o valor final (somente o valor do prato).
Codigo		 Prato		 	Valor 
1 		Picanha 		25,00 
2 		Lasanha 		20,00 
3 		Strogonoff 		18,00 
4 		Bife Acebolado 	15,00 
5 		P�o com ovo 		5,00 
*/
	
		int op, gorjeta;
		double total = 0;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("\tCARD�PIO");
		System.out.println("C�digo\tPrato\t\tValor");
		System.out.println("1\tPicanha\t\t25,00");
		System.out.println("2\tLasanha\t\t20,00");
		System.out.println("3\tStrogonoff\t18,00");
		System.out.println("4\tBife Acebolado\t15,00");
		System.out.println("5\tP�o com ovo\t5,00");
		op = L.nextInt();
		
		System.out.println("\nVoc� deseja dar 10% sobre o valor do seu prato em gorjeta?\nDigite 1 para SIM e 2 para N�O");
		gorjeta = L.nextInt();
		
		switch(op) {
			case 1:
				if (gorjeta == 1) {
					total = (25*0.1)+25;
					System.out.println("O total do pedido � R$"+total);
				}else {
					System.out.println("O total do pedido � R$"+total);
				}
			break;
			
			case 2:
				if (gorjeta == 1) {
					total = (20*0.1)+20;
					System.out.println("O total do pedido � R$"+total);
				}else {
					System.out.println("O total do pedido � R$"+total);
				}
			break;
			
			case 3:
				if (gorjeta == 1) {
					total = (18*0.1)+18;
					System.out.println("O total do pedido � R$"+total);
				}else {
					System.out.println("O total do pedido � R$"+total);
				}
			break;
			
			case 4:
				if (gorjeta == 1) {
					total = (15*0.1)+15;
					System.out.println("O total do pedido � R$"+total);
				}else {
					System.out.println("O total do pedido � R$"+total);
				}
			break;
			
			case 5:
				if (gorjeta == 1) {
					total = (5*0.1)+5;
					System.out.println("O total do pedido � R$"+total);
				}else {
					System.out.println("O total do pedido � R$"+total);
				}
			break;
		
			default:
				System.out.println("Essa op��o n�o existe");
		}
	}
}