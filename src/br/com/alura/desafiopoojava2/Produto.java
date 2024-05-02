package br.com.alura.desafiopoojava2;

public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void verificaDesconto() {
        if (preco > 100) {
            System.out.println("Você tem direito a um desconto de 10%");
            preco *= 0.9;
            System.out.println("Novo preço: R$" + preco);
        } else {
            System.out.println("Preço sem desconto. Valor total: R$" + preco);
        }
    }
}
