package br.com.alura.desafiopoojava2;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno novoAluno = new Aluno();

        novoAluno.setNome("Maria Sophia");
        novoAluno.setNotas(10.0);
        novoAluno.setNotas(8.2);
        novoAluno.setNotas(7.5);

        System.out.println("A média da aluna " + novoAluno.getNome() + " é: " + novoAluno.calculaMedia());
    }
}
