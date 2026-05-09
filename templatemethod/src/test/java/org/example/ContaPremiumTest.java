package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPremiumTest {

    @Test
    void deveRetornarLimiteVipLiberado() {
        ContaPremium conta = new ContaPremium();
        conta.setSaldo(-100.0f);
        assertEquals("Limite VIP Liberado", conta.verificarDisponibilidadeLimite());
    }

    @Test
    void deveRetornarLimiteVipNegado() {
        ContaPremium conta = new ContaPremium();
        conta.setSaldo(-100.1f);
        assertEquals("Limite Suspenso por Inadimplência", conta.verificarDisponibilidadeLimite());
    }

}