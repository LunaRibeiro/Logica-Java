package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
		 -	10-14 infantil
		 -	15-17 juvenil
		 -	18-25 adulto*/
		
		int idade = 0;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		idade = L.nextInt();
		
		if(idade >= 10 && idade <= 14) {
				System.out.println("Voc� � infantil! :)");
			
		}else if(idade >= 15 && idade <= 17) {
				System.out.println("Voc� � Juvenil!:D");
		}else if(idade >= 18 && idade <= 25) {
				System.out.println("Voc� � Adulto :/");
		}else if(idade > 25){
			System.out.println("Voc� � um Idoso (ou quase um haha)");
		}else {
			System.out.println("Voc� � um beb�!");
		}
	}
}