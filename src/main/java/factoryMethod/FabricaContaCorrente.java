package factoryMethod;

public class FabricaContaCorrente implements FabricaAbstrata{

    @Override
    public Extrato createExtrato() {
        return new ExtratoContaCorrente();
    }

    @Override
    public Saque createSaque() {
        return new SaqueContaCorrente();
    }

    @Override
    public Deposito createDeposito() {
        return new DepositoContaCorrente();
    }
}
