package br.servicos;
//importações
import br.entidades.Bilhete;
import java.util.ArrayList;
public class BilheteServico {

	// criando o ArrayList;
	private ArrayList<String> bilhete;

	// inicializando o ArrayList;
	private Bilhete(ArrayList<String> bilhete) {
		bilhete = new ArrayList<String>();
	}
    // Crud do ArrayList;
	private ArrayList<String> getBilhete() {
		return bilhete;
	}

	private void setBilhete(ArrayList<String> bilhete) {
		this.bilhete = bilhete;
	}

	private void addBilhete(String b) {
		bilhete.add(b);
	}

	private void removeBilhete(String b) {
		try {
			for (int i = 0; i < bilhete.size(); i++) {
				if (bilhete.get(i) == b) {
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