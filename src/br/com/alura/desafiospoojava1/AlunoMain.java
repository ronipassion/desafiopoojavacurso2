package br.com.alura.desafiospoojava1;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno novoAluno = new Aluno();

        novoAluno.nomeAluno = "Pedro Silva";
        novoAluno.idadeAluno = 19;

        novoAluno.exibirInformacoesAluno();
    }
}
