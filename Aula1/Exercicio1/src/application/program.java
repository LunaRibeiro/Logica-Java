package application;

import java.util.Scanner;

//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

public class program {

	public static void main(String[] args) {

		int anos, meses, dias, result;

		Scanner L = new Scanner(System.in);

		System.out.println("Informe a sua idade: ");
		anos = L.nextInt();

		System.out.println("Informe quantos meses: ");
		meses = L.nextInt();

		System.out.println("Informe quantos dias");
		dias = L.nextInt();

		result = (anos * 365) + (meses * 30) + dias; // ver quantos dias tem de vida

		System.out.println("Você tem " + result + " dias de vida");

	}

}
