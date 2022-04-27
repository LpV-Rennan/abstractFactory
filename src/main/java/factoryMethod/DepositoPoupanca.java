package factoryMethod;

public class DepositoPoupanca implements Deposito{
    @Override
    public String depositar() {
        return "Depósito efetuado em sua conta poupanca";
    }
}
