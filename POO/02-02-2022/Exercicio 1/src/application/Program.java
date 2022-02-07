package application;

import entities.cachorro;
import entities.cavalo;
import entities.preguica;

public class Program {
	public static void main(String[] args) {
		cavalo peDePano = new cavalo("Ventania");
		peDePano.corre("Sim");
		peDePano.latir("n�o");
		peDePano.subirArvore("sim");
		
		System.out.println("\n --------------\n");
		cachorro max = new cachorro("Tobs");
		max.corre("sim");
		max.latir("sim");
		max.subirArvore("sim");
		
		System.out.println("\n --------------\n");
		preguica pepe = new preguica("Pepe");
		pepe.corre("nao");
		pepe.latir("sim");
		pepe.subirArvore("sim");
	}
}