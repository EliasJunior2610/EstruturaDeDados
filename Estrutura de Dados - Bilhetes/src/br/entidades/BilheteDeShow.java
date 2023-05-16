//nome do pacote;
package br.entidades;

//inicializando a entidade;
public class BilheteDeShow extends Bilhete {

    // herdando atributos da entidade mãe;
    public BilheteDeShow(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }

}