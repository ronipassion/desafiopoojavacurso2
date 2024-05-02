package br.com.alura.desafiopoojava2;

public class IdadePessoaMain {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Claudia Ramos");
        pessoa.setIdade(69);


        System.out.println("Bem-vinda, " + pessoa.getNome());
        pessoa.verificarMaiorIdade();
    }
}
