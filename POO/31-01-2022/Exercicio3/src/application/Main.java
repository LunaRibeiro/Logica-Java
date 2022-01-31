package application;

import entities.product;

public class Main {
/*Crie uma classe produto eletrônico e apresente os atributos e 
métodos referentes esta classe, em seguida crie um objeto produto 
eletrônico, defina as instancias deste objeto e apresente as 
informações deste objeto no console.*/
	
	public static void main(String[] args) {
		
		product[] p = new product[3];

		p[0] = new product(1,"Memória Ram", 234, "A vista");
		p[1] = new product(2,"Playstation 5", 5000, "12x");
		p[2] = new product(3,"iMAC pro", 22000, "24x");
		
		//for each
		
		for(product rod: p) {
			rod.imprimir();
			System.out.println("\n\n");
		}		
	}
}
