package br.com.alura.desafiopoojava2;

public class Livro {
    private String titulo;
    private String autorNome;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo(String s) {
        return titulo;
    }

    public void setAutorNome(String autorNome) {
        this.autorNome = autorNome;
    }

    public String getAutorNome() {
        return autorNome;
    }

    public void exibirDetalhes() {
        System.out.println("O título do livro é: " + titulo);
        System.out.println("O autor é: " + autorNome);
    }
}
