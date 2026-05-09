package org.example;

public class ContaComum extends Conta {

    public String verificarDisponibilidadeLimite() {
        if (this.getSaldo() >= 500.0f) {
            return "Limite Liberado";
        } else {
            return "Limite Negado";
        }
    }

    public String getTipo() {
        return "Conta Corrente Comum";
    }
}
