//nome do pacote;
package br.repositorios;

//importação;
import java.util.ArrayList;

//inicializando o repositório;
public class BilheteRepositorio {
    // criando o ArrayList;
    private ArrayList<String> bilheteRepositorio;

    // inicializando o ArrayList;
    public BilheteRepositorio(ArrayList<String> bilheteRepositorio) {
        super();
        this.bilheteRepositorio = bilheteRepositorio;
    }

    // Crud do ArrayList;
    public ArrayList<String> getBilheteRepositorio() {
        return bilheteRepositorio;
    }

    public void setBilheteRepositorio(ArrayList<String> bilheteRepositorio) {
        this.bilheteRepositorio = bilheteRepositorio;
    }
    
    public void addBilheteRepositorio(String b) {
        bilheteRepositorio.add(b);
    }

    public void removeBilheteRepositorio(String b) {
        try {
            for (int i = 0; i < bilheteRepositorio.size(); i++) {
                if (bilheteRepositorio.get(i).equals(b)) {
                    bilheteRepositorio.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
            System.out.println("Apenas itens que se encontram na lista podem ser apagados.");
        }
    }
}
