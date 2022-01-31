package application;
/*Crie uma classe funcionário e apresente os atributos e métodos 
referentes esta classe, em seguida crie um objeto funcionário, 
defina as instancias deste objeto e apresente as informações deste 
objeto no console.*/

import entities.employee;

public class Main {
	

	public static void main(String[] args) {
		
		employee[] e = new employee[3];
		
		e[0] = new employee("Luna","Carapicuíba",22);
		e[1] = new employee("Arthur","Votuporanga",20);
		e[2] = new employee("Isaberura","Jundiaí",21);
		
		//for each
		
		for(employee roda: e) {
			roda.imprimir();
			System.out.println("\n");
		}
	}

}
