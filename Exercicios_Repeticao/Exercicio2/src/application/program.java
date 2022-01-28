package application;

import java.util.Scanner;

public class program{

	public static void main(String[] args) {
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int par = 0, impar = 0, num;
		
		Scanner L = new Scanner(System.in);
		
		for(int x = 0; x < 10; x++) {
			
			System.out.println("Infome um número: ");
			num = L.nextInt();
			
			if(num % 2 == 0) {
				par++;	//contador de numero par
			}else if(num % 2 != 0) {
				impar++;	//contador de numero impar
			}
		}
		System.out.println("Tem "+par+" pares e "+impar+" impares");
	}

}