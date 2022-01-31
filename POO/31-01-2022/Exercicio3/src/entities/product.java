package entities;

import java.text.NumberFormat;

public class product {
	
	//atributos
	private int id;
	private String nome;
	private int valor;
	private String pagamento;
	
	//construtor
	public product(int id, String nome, int valor, String pagamento) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.pagamento = pagamento;
	}
	
	public String valorFormatado() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //Declara fun��o	
		nf.setMinimumFractionDigits(2); //coloca o n�mero de casas ap�s a v�rgula
		String valorFormatado = nf.format(valor); //atribui
		
		return valorFormatado; // retorna
	}
	
	public void imprimir() {
		System.out.println("ID: "+id+"\nNome: "+nome+"\nValor: "+this.valorFormatado()
				+"\nPagamento: "+pagamento);
	
	}
}
