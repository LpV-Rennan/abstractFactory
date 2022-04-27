package factoryMethod;

public class DepositoContaCorrente implements Deposito{


    @Override
    public String depositar() {
        return "Deposito efetuado na conta corrente";
    }
}
