package br.com.alura.desafiospoojava1;

public class CarroMain {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modeloCarro = "Kombi";
        meuCarro.corCarro = "branca";
        meuCarro.anoDeLancamentoCarro = 1957;

        meuCarro.exibeFichaCarro();
        System.out.println("O carro já tem: " + meuCarro.idadeCarro(2024) + " anos.");
    }
}
