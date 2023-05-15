public interface IPassagem {
    //abre uma classe boolean, já que, é possivel escolher apenas dois valores, se vai ou não ir pra primeira classe.
    public boolean primeira_classe = true;
    // método utilizado no Serviço.
    // enumeração para os valores possíveis do destino da viagem;
    enum Estado {
        PERNAMBUCO,
        PARAIBA,
        ALAGOAS,
        SERGIPE,
        AMAZONAS
    }
    public void cadastrar(double preço, double horário, int quantidade);
}