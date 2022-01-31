package entities;

public class employee {
	
	//atributos
	private String nome;
	private String endereco;
	private int idade;
	
	//construtor
	public employee(String nome, String endereco, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
	}
	
	//Get e Set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void imprimir() {
		System.out.println("\nNome: "+nome+" - Endereço: "+endereco+" - Idade: "+idade);
		
	}
	

}
