package br.com.alura.desafiospoojava1;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int quantidadeDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("O título da música é: " + titulo);
        System.out.println("Do artista: " + artista);
        System.out.println("Lançada em: " + anoDeLancamento);
    }

    void avalia (double nota) {
        avaliacao += nota;
        quantidadeDeAvaliacoes++;
    }

    double media () {
        return avaliacao / quantidadeDeAvaliacoes;
    }
}
