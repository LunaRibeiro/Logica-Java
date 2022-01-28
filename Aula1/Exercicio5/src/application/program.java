package application;

import java.util.Scanner;

/*5.Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/

public class program {

	public static void main(String[] args) {
		
		float n1, n2, n3, r;
		
		Scanner L = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		n1 = L.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		n2 = L.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		n3 = L.nextFloat();
		
		r = ((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.printf("O resultado da média ponderada é: %.2f ", r);	//printf pra conseguir arrendodar mais fácil.

	}

}