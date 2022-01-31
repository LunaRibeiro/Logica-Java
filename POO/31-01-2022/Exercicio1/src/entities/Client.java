package entities;

public class Client {

	//atributos
	private String nome;
	private double altura;
	private double peso;
	
	//construtor
	public Client (String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String imc(){
		//Calcula o IMC
		double imc = this.peso/(this.altura*this.altura);
		return String.format("%.2f", imc);
		
	}
	
	
		
}
