package application;
/*Crie uma classe funcion�rio e apresente os atributos e m�todos 
referentes esta classe, em seguida crie um objeto funcion�rio, 
defina as instancias deste objeto e apresente as informa��es deste 
objeto no console.*/

import entities.employee;

public class Main {
	

	public static void main(String[] args) {
		
		employee[] e = new employee[3];
		
		e[0] = new employee("Luna","Carapicu�ba",22);
		e[1] = new employee("Arthur","Votuporanga",20);
		e[2] = new employee("Isaberura","Jundia�",21);
		
		//for each
		
		for(employee roda: e) {
			roda.imprimir();
			System.out.println("\n");
		}
	}

}
