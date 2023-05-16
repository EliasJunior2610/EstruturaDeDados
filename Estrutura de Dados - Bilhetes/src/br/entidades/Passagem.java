//nome do pacote;
package br.entidades;

//inicializando a entidade;
public class Passagem extends Bilhete {
    //criando a váriavel poltrona, junto com seu getter e setter;
    private String poltrona;
    
    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }
	//herdando atributos da entidade mãe;
    public Passagem(double horário, double preço, int quantidade, String poltrona) {
        super(horário, preço, quantidade);  
        this.poltrona = poltrona;   
    }
    
}