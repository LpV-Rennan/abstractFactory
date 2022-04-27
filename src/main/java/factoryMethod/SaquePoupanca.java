package factoryMethod;

public class SaquePoupanca implements Saque{
    @Override
    public String efetuarSaque() {
        return "Saque efetuado sem custo";
    }
}
