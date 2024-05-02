package br.com.alura.desafiopoojava2;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();

        novoProduto.setNome("Calça Jeans");
        novoProduto.setPreco(120.90);

        System.out.println("O produto é: " + novoProduto.getNome());
        System.out.println("O preço é: R$" + novoProduto.getPreco());
        novoProduto.verificaDesconto();
    }
}
