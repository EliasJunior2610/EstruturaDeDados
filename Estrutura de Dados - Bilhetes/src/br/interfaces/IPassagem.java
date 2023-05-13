public interface IPassagem {
    //abre uma classe boolean, já que, é possivel escolher apenas dois valores, se vai ou não ir pro camarote.
    public boolean camarote = true;
    // método utilizado no Serviço.
    // enumeração para os valores possíveis do gênero dos filmes
    enum Genero {
        FANTASIA,
        ANIVERSARIO,
        CASAMENTO,
        FORMATURA,
        TERROR
    }
    public void cadastrar(double preço, double horário, int quantidade);
}