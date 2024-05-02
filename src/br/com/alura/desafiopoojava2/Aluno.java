package br.com.alura.desafiopoojava2;

public class Aluno {
    private String nome;
    private double notas;
    private int quantidadeNotas = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        quantidadeNotas++;
    }

    public double getNotas() {
        return notas;
    }

    public double calculaMedia () {
        double media = notas / quantidadeNotas;
        return media;
    }
}
