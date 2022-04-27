package factoryMethod;

public class SaqueContaCorrente implements Saque {
    @Override
    public String efetuarSaque() {
        return "saque efetuado com custo de operação";
    }
}
