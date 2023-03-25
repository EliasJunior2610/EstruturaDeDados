package br.interfaces;

public interface ITeatro {
    //abre uma classe string para representar o lugar.
    public String lugar = "A4";
    //abre a variavel int, já que é necessario o só de numeros inteiros para saber a quantidade de apresentações, exemplo: mão da para ver duas apresentações e meio.
    public int númeroDeApresentações = 4; 
    // método utilizado no Serviço.
    // enumeração para os valores possíveis do gênero dos filmes
    enum Genero {
        ACAO,
        AVENTURA,
        COMEDIA,
        DRAMA,
        ROMANCE,
        FANTOCHE
    }
    public void cadastrar(double preço, double horário, int quantidade);
}
