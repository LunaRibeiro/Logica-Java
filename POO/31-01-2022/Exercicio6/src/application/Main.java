package application;

/*Crie uma classe conta bancaria e apresente os atributos e 
m�todos referentes esta classe, em seguida crie um objeto conta 
bancaria, defina as instancias deste objeto e apresente as 
informa��es deste objeto no console.*/

import entities.banco;

public class Main {

	public static void main(String[] args) {
		
		banco b1 = new banco("Luna Ribeiro", "Carapicu�ba", 0);
		
		b1.imprimir();
	}

}
