package entities;

public class preguica extends animal{
	
	private boolean subirArvore;

	public preguica(String nome, int idade, boolean imiteSom, boolean subirArvore) {
		super(nome, idade, imiteSom);
		this.subirArvore = subirArvore;
	}

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}

	@Override
	public String toString() {
		return "Preguica [subirArvore=" + subirArvore + ", isSubirArvore()=" + isSubirArvore() + ", getNome()="
				+ getNome() + ", getIdade()=" + getIdade() + ", isImiteSom()=" + isImiteSom() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
