package br.com.alura.desafiopoojava2;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo = 3000;
    public String titular;

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
