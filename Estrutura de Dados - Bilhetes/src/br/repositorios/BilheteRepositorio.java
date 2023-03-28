//Nome do pacote
package br.repositorios;
//Importação
import java.util.Stack;
//Criação da classe
public class BilheteRepositorio {
    //Definindo a pilha
    private Stack<String> bilhetes;
    //Inicializando a pilha
    public BilheteRepositorio() {
        bilhetes = new Stack<String>();
    }
    //Crud da pilha
    public void addBilheteRepositorio(String bilhete) {
        bilhetes.push(bilhete);
    }

    public String getUltimoBilhete() {
        return bilhetes.peek();
    }

    public void removerUltimoBilhete() {
        bilhetes.pop();
    }

    public Stack<String> getBilheteRepositorio() {
        return bilhetes;
    }
}

