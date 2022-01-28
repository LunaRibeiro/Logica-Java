package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos 
indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, 
sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, se a pessoa 
era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os 
dados de 150 pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.
*/
		int idade, sexo, op, x = 0;
		int p_calmos = 0;
		int f_nervosas = 0;
		int m_agressivos = 0;
		int o_calmos = 0;
		int nervosas40 = 0;
		int calmos18 = 0;
		
		
		Scanner L = new Scanner(System.in);
			
		while (x < 150) {
			System.out.println("Informe a idade: ");
			idade = L.nextInt();
			System.out.println("Informe o Sexo:\n1 - Feminino\n2 - Masculino\n3 - Outros ");
			sexo = L.nextInt();
			System.out.println("Escolha a op��o:\n1 - A pessoa era calma\n2 - A pessoa era nervosa\n3 - A pessoa era agressiva ");
			op = L.nextInt();
			
			if (op == 1){	//verifica se escolheu a op��o calmo
				if(idade < 18) {	//verifica se � menor de 18
					calmos18++;
				}	
				p_calmos++;
			}else if(sexo == 1 && op == 2) {	//verifica se escolheu o sexo feminino e a op��o 2
				if (idade > 40) {	//verifica se a idade � maior que 40
					nervosas40++;
				}
				f_nervosas++;
			}else if(sexo == 2 && op == 3) {	//verifica se � masculino e escolheu a op��o 3
				m_agressivos++;
			}else if(sexo == 3 && op == 1) {	//verifica se escolheu outros e escolheu a op��o 1
				o_calmos++;
			}
			x++;
		}
		
		System.out.println("O numero de pessoas calmas � "+p_calmos);
		System.out.println("O numero de mulheres nervosas � "+ f_nervosas);
		System.out.println("O numero de homens agressivos � "+m_agressivos);
		System.out.println("O numero de outros calmos � "+o_calmos);
		System.out.println("O numero de pessoas maiores de 40 e nervosas � "+nervosas40);
		System.out.println("O numero de menores de 18 e calmos � "+calmos18);
	}

}