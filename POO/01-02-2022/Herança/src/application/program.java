package application;

import entities.animal;
import entities.cachorro;
import entities.cavalo;
import entities.preguica;

public class program {
	public static void main(String[] args) {
		
		cachorro Tobs = new cachorro("Tobs", 6, true, "Nenem", true);
		
		cavalo Ventania = new cavalo("Ventania", 4, true, true);
		
		preguica Guita = new preguica("Pépe", 3, false, true);
		
		System.out.println(Tobs);
		System.out.println();
		
		System.out.println(Ventania);
		System.out.println();
		
		System.out.println(Guita);
	}

}