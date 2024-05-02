package br.com.alura.desafiopoojava2;

public class LivroMain {
    public static void main(String[] args) {
        Livro novoLivro = new Livro();

        novoLivro.setTitulo("Harry Potter: E A Pedra Filosofal");
        novoLivro.setAutorNome("J.K Rowling");

        novoLivro.exibirDetalhes();
    }
}
