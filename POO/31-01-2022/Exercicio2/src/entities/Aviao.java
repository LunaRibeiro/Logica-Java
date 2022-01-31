package entities;


public class Aviao {
	
	//atributos
	public String modelo;
	public int passageiros;
	public int ano;
	
	
	//construtor
	public Aviao(String modelo, int passageiros, int ano) {
		
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.ano = ano;
	}
	
	public void imprimir() {
		System.out.println("\n O modelo deste avião é "+modelo
		+" do ano "+ano+" com capacidade de "+passageiros+" passageiros");
	}
	

	//Get and Set
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	
	
	
	
}
