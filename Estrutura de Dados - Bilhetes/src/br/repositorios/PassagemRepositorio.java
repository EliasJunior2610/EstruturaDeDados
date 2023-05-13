//nome do pacote;
package br.repositorios;

//importação;
import java.util.ArrayList;

//inicializando o repositório;
public class PassagemRepositorio {
    // criando o ArrayList;
    ArrayList<String> passagemRepositorio;

    // inicializando o ArrayList;
    public PassagemRepositorio(ArrayList<String> passagemRepositorio) {
        passagemRepositorio = new ArrayList<String>();
    }

    // Crud do ArrayList;
    public ArrayList<String> getPassagemRepositorio() {
        return passagemRepositorio;
    }

    public void setPassagemRepositorio(ArrayList<String> passagemRepositorio) {
        this.passagemRepositorio = passagemRepositorio;
    }

    public void addPassagemRepositorio(String f) {
        passagemRepositorio.add(f);
    }

    public void removePassagemRepositorio(String f) {
        try {
            for (int i = 0; i < passagemRepositorio.size(); i++) {
                if (passagemRepositorio.get(i) == f) {
                    passagemRepositorio.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
            System.out.println("Apenas item que se encontram na lista podem ser apagados.");
        }
    }

}