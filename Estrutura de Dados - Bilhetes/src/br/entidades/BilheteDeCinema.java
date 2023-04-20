//nome do pacote;
package br.entidades;

//importações;
import java.util.ArrayList;

//inicializando a entidade;
public class BilheteDeCinema extends Bilhete {
    //criando o ArrayList;
    private ArrayList<String> bilhete;
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

    // inicializando o ArrayList;
    private void Bilhete(ArrayList<String> bilhete) {
        bilhete = new ArrayList<String>();
    }

    // Crud do ArrayList;
    private ArrayList<String> getBilhete() {
        return bilhete;
    }

    private void setBilhete(ArrayList<String> bilhete) {
        this.bilhete = bilhete;
    }

    private void addBilhete(String c) {
        bilhete.add(c);
    }

    private void removeBilhete(String c) {
        try {
            for (int i = 0; i < bilhete.size(); i++) {
                if (bilhete.get(i) == c) {
                    bilhete.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
            System.out.println("Apenas item que se encontram na lista podem ser apagados.");
        }
    }
}
