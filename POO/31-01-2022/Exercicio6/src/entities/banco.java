package entities;

public class banco {

	//atributos
	private String nome;
	private String endereco;
	private double saldo;
	
	//construtor
	public banco(String nome, String endereco, double saldo) {
		this.nome = nome;
		this.endereco = endereco;
		this.saldo = saldo;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+nome+"\nEndereço: "+endereco
				+"\nSaldo: "+saldo);
		System.out.println("\n");
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
