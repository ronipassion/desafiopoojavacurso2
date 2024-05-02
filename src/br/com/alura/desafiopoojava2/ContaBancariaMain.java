package br.com.alura.desafiopoojava2;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Francisco da Silva";
        conta.setNumeroDaConta(123456789);

        System.out.println("**************************");
        System.out.println("Bem-vindo: " + conta.getTitular());
        System.out.println("Conta do titular: " + conta.getNumeroDaConta());
        System.out.println("Saldo atual da conta: R$" + conta.getSaldo());
    }
}
