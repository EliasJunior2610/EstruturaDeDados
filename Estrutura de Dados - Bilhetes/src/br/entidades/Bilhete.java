//nome do pacote;
package br.entidades;

//inicializando a entidade;
public class Bilhete {

	// atributos da entidade
	public double horário;
	public double preço;
	public int quantidade;

	// configurando os atributos;
	public Bilhete(double horário, double preço, int quantidade) {
		super();
		this.horário = horário;
		this.preço = preço;
		this.quantidade = quantidade;
	}

	// getters e setters;
	public double getHorario() {
		return horário;
	}

	public void setHorario(double horário) {
		this.horário = horário;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}