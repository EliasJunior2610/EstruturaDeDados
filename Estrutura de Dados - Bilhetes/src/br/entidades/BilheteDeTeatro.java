//nome do pacote;
package br.entidades;

//inicializando a entidade;
public class BilheteDeTeatro extends Bilhete {

    // herdando atributos da entidade mãe;
    public BilheteDeTeatro(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
 
}