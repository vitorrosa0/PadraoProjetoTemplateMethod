package org.example;

public abstract class Conta {

    private int numero;
    private String titular;
    private float saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean possuiSaldoPositivo() {
        return this.saldo >= 0;
    }

    public abstract String verificarDisponibilidadeLimite();

    public String getTipo() {
        return "Conta Bancária";
    }

    public String getInformacoes() {
        return getTipo() + " {" +
                "Número=" + this.numero +
                ", Titular='" + this.titular + '\'' +
                ", Status Crédito=" + this.verificarDisponibilidadeLimite() +
                '}';
    }
}
