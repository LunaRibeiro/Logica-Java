package application;

/*Crie uma classe conta bancaria e apresente os atributos e 
métodos referentes esta classe, em seguida crie um objeto conta 
bancaria, defina as instancias deste objeto e apresente as 
informações deste objeto no console.*/

import entities.banco;

public class Main {

	public static void main(String[] args) {
		
		banco b1 = new banco("Luna Ribeiro", "Carapicuíba", 0);
		
		b1.imprimir();
	}

}
