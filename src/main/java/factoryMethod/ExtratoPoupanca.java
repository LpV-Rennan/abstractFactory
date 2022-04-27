package factoryMethod;

public class ExtratoPoupanca implements Extrato{

    @Override
    public String emitir() {
        return "Extrato da conta Poupança";
    }
}
