package br.com.alura.desafiospoojava1;

public class Carro {
    String modeloCarro;
    String corCarro;
    int anoDeLancamentoCarro;

    void exibeFichaCarro() {
        System.out.println("O modelo do carro é: " + modeloCarro);
        System.out.println("A cor do carro é: " + corCarro);
        System.out.println("O ano de lançamento do carro é: " + anoDeLancamentoCarro);
    }

    int idadeCarro(int anoAtual) {
        return anoAtual - anoDeLancamentoCarro;
    }

}
