package org.example;

public class ContaPremium extends Conta {

    public String verificarDisponibilidadeLimite() {
        if (this.getSaldo() >= -100.0f) {
            return "Limite VIP Liberado";
        } else {
            return "Limite Suspenso por Inadimplência";
        }
    }

    public String getTipo() {
        return "Conta Corrente Premium";
    }
}
