package br.com.alura.desafiopoojava2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void verificarMaiorIdade() {
        if (idade < 18) {
            System.out.println("Sua idade é " + idade + ", e você é menor de idade");
        } else {
            System.out.println("Sua idade é " + idade + ", e você é maior de idade");
        }
    }
}
