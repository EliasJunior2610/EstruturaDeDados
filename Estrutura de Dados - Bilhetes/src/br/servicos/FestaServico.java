package br.servicos;
//irá importar a entidade de bilhetes
import br.entidades.Passagem;
import br.interfaces.IFesta;
//implementando a interface.
public class FestaServico implements IFesta {
	//criamos um método cadastrar e dentro dele instanciamos um novo bilhete e configuramos os atributos dessa instância
	public void cadastrar(double preço, double horário, int quantidade) {
		// try irá tentar colocar um novo valor para os atributos
		try {
            Passagem f1 = new Passagem(horário, preço, quantidade, null);
            f1.setHorario(horário);
            f1.setPreço(preço);
            f1.setQuantidade(quantidade);
        } //catch irá se ativar caso o bloco acima dê erro
        catch (Exception ex) {
            System.out.println("Erro!");
        }
    }    
}
