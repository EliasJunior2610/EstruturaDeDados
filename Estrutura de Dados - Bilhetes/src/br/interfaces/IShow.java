package br.interfaces;

public interface IShow {
    //abre uma classe string para representar o nome da banda.
    public String nomeDaBanda = "Mamonas Assassinas";
    //abre uma classe boolean, já que, deve se escolher entre dois valores, nesse caso se vai ou não ir para o camarote.
    public boolean camarote = true;
    // método utilizado no Serviço.
    // enumeração para os valores possíveis do gênero dos filmes
    enum Genero {
        ROCK,
        FUNK,
        SERTANEJO,
        FORRO,
        SAMBA,
        INDIE
    }
    public void cadastrar(double preço, double horário, int quantidade);
}
