//nome do pacote;
package br.entidades;

//inicializando a entidade;
public class BilheteDeCinema extends Bilhete {
    //criando a váriavel poltrona, junto com seu getter e setter;
    private String poltrona;
    
    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    // herdando atributos da entidade mãe;
    public BilheteDeCinema(double horário, double preço, int quantidade, String poltrona) {
        super(horário, preço, quantidade);
        this.poltrona = poltrona;
    }

    //getter e setter do ArrayList;
    private ArrayList<String> getBilhete() {
        return bilhete;
    }

    private void setBilhete(ArrayList<String> bilhete) {
        this.bilhete = bilhete;
    }

}