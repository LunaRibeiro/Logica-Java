package application;

/*Crie uma classe cliente e apresente os atributos
e métodos referentes esta classe, em seguida crie um objeto cliente,
defina as instancias deste objeto e apresente as informações deste 
objeto no console.*/

import entities.Client; //importando a outra classe

public class Main {

	public static void main(String[] args) {
		//Nome, altura e peso
		
		Client Luna = new Client("Luna Ribeiro", 1.64, 65); //instancia o construtor
		
		System.out.println("O peso de Luna é: "+Luna.getPeso()+" O IMC é: "+Luna.imc());
		
		
	}

}
