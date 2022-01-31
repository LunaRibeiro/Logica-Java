package entities;

public class patinete {
	
	//atributos
	private String modelo;
	private String cor;
	private int rodas;
	
	//construtor
	public patinete(String modelo, String cor, int rodas) {
		this.modelo = modelo;
		this.cor = cor;
		this.rodas = rodas;
	}
	
	public void imprimir() {
		System.out.println("Modelo: "+modelo+"\nCor: "+cor+"\nRodas: "+rodas);
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public int getRodas() {
		return rodas;
	}
	
	
	
}
