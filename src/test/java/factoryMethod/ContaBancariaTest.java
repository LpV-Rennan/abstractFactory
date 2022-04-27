package factoryMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContaBancariaTest {

    @Test
    void deveRetornarDepositoCorrente() {
        ContaBancaria conta = new ContaBancaria(new FabricaContaCorrente());
        Assertions.assertEquals("Deposito efetuado na conta corrente", conta.depositar());
    }

    @Test
    void deveRetornarDepositoPoupanca() {
        ContaBancaria conta = new ContaBancaria(new FabricaContaPoupanca());
        Assertions.assertEquals("Depósito efetuado em sua conta poupanca", conta.depositar());
    }

    @Test
    void deveRetornarExtratoCorrente() {
        ContaBancaria conta = new ContaBancaria(new FabricaContaCorrente());
        Assertions.assertEquals("Extrato de conta corrente", conta.emitirExtrato());
    }

    @Test
    void deveRetornarExtratoPoupanca() {
        ContaBancaria conta = new ContaBancaria(new FabricaContaPoupanca());
        Assertions.assertEquals("Extrato da conta Poupança", conta.emitirExtrato());
    }

    @Test
    void deveRetornarSaqueCorrente() {
        ContaBancaria conta = new ContaBancaria(new FabricaContaCorrente());
        Assertions.assertEquals("saque efetuado com custo de operação", conta.efetuarSaque());
    }

    @Test
    void deveRetornarSaquePoupanca() {
        ContaBancaria conta = new ContaBancaria(new FabricaContaPoupanca());
        Assertions.assertEquals("Saque efetuado sem custo", conta.efetuarSaque());
    }


}