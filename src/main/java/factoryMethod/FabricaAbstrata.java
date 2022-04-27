package factoryMethod;

public interface FabricaAbstrata {
    Extrato createExtrato();
    Saque createSaque();
    Deposito createDeposito();
}
