package factoryMethod;

public class FabricaContaPoupanca implements FabricaAbstrata{
    @Override
    public Extrato createExtrato() {
        return new ExtratoPoupanca();
    }

    @Override
    public Saque createSaque() {
        return new SaquePoupanca();
    }

    @Override
    public Deposito createDeposito() {
        return new DepositoPoupanca();
    }
}
