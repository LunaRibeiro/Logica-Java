package application;

import java.util.Scanner;

/*5.Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/

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
		
		System.out.printf("O resultado da m�dia ponderada �: %.2f ", r);	//printf pra conseguir arrendodar mais f�cil.

	}

}