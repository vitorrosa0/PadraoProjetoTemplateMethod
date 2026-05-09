package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaComumTest {

    @Test
    void deveRetornarLimiteLiberado() {
        ContaComum conta = new ContaComum();
        conta.setSaldo(500.0f);
        assertEquals("Limite Liberado", conta.verificarDisponibilidadeLimite());
    }

    @Test
    void deveRetornarLimiteNegado() {
        ContaComum conta = new ContaComum();
        conta.setSaldo(499.9f);
        assertEquals("Limite Negado", conta.verificarDisponibilidadeLimite());
    }

}