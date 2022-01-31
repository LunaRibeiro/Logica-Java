package application;

/*Crie uma classe patinete e apresente os atributos e m�todos 
referentes esta classe, em seguida crie um objeto patinete, 
defina as instancias deste objeto e apresente as informa��es 
deste objeto no console.*/

import entities.patinete;

public class Main {

	public static void main(String[] args) {
		
		patinete[] p = new patinete[4];
		
		p[0] = new patinete("Tradicional", "Preto", 2);
		p[1] = new patinete("Motorizado", "Vermelho", 2);
		p[2] = new patinete("Tr�s rodas Infantil", "Amarelo", 3);
		p[3] = new patinete("Trikke", "Azul", 3);
		
		//for each
		
		for(patinete r:p) {
			r.imprimir();
			System.out.println("\n");
		}
	}

}
