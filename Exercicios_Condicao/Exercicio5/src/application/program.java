package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Faça um programa que mostre um Menu com opções de um cardápio de restaurante para uma pessoa. 
A pessoa vai escolher o prato desejado: 
Após escolher o prato, o programa deverá fazer uma pergunta ao usuário, se ele aceita pagar a 
gorjeta do garçom 10% sobre o valor do prato. Se o usuário aceitar, mostrar o valor final 
(valor do prato + 10%), caso contrário, mostrar o valor final (somente o valor do prato).
Codigo		 Prato		 	Valor 
1 		Picanha 		25,00 
2 		Lasanha 		20,00 
3 		Strogonoff 		18,00 
4 		Bife Acebolado 	15,00 
5 		Pão com ovo 		5,00 
*/
	
		int op, gorjeta;
		double total = 0;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("\tCARDÁPIO");
		System.out.println("Código\tPrato\t\tValor");
		System.out.println("1\tPicanha\t\t25,00");
		System.out.println("2\tLasanha\t\t20,00");
		System.out.println("3\tStrogonoff\t18,00");
		System.out.println("4\tBife Acebolado\t15,00");
		System.out.println("5\tPão com ovo\t5,00");
		op = L.nextInt();
		
		System.out.println("\nVocê deseja dar 10% sobre o valor do seu prato em gorjeta?\nDigite 1 para SIM e 2 para NÃO");
		gorjeta = L.nextInt();
		
		switch(op) {
			case 1:
				if (gorjeta == 1) {
					total = (25*0.1)+25;
					System.out.println("O total do pedido é R$"+total);
				}else {
					System.out.println("O total do pedido é R$"+total);
				}
			break;
			
			case 2:
				if (gorjeta == 1) {
					total = (20*0.1)+20;
					System.out.println("O total do pedido é R$"+total);
				}else {
					System.out.println("O total do pedido é R$"+total);
				}
			break;
			
			case 3:
				if (gorjeta == 1) {
					total = (18*0.1)+18;
					System.out.println("O total do pedido é R$"+total);
				}else {
					System.out.println("O total do pedido é R$"+total);
				}
			break;
			
			case 4:
				if (gorjeta == 1) {
					total = (15*0.1)+15;
					System.out.println("O total do pedido é R$"+total);
				}else {
					System.out.println("O total do pedido é R$"+total);
				}
			break;
			
			case 5:
				if (gorjeta == 1) {
					total = (5*0.1)+5;
					System.out.println("O total do pedido é R$"+total);
				}else {
					System.out.println("O total do pedido é R$"+total);
				}
			break;
		
			default:
				System.out.println("Essa opção não existe");
		}
	}
}