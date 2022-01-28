package application;

import java.util.Scanner;

//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

public class program {

	public static void main(String[] args) {
		int evento, segs, horas, min;

		Scanner L = new Scanner(System.in);

		System.out.println("Quanto tempo durou o evento? Expresse em segundos: ");
		evento = L.nextInt();

		horas = evento / 3600;
		min = (evento % 3600) / 60;
		segs = (evento % 3600) % 60;

		System.out.println("O evento teve " + horas + " horas, " + min + " minutos e " + segs + " segundos");

	}

}
