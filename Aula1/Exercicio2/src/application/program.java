package application;

import java.util.Scanner;

//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

public class program {
	public static void main(String[] args) {

		int total, ano, mes, dia;

		Scanner L = new Scanner(System.in);

		System.out.println("Infome sua idade em dias: ");
		total = L.nextInt();

		ano = total / 365;
		mes = (total % 365) / 30;
		dia = (total % 30) % 30;

		System.out.println("Você tem " + ano + " anos, " + mes + " meses e " + dia + " dia(s)");

	}
}
