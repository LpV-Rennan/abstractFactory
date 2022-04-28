package factoryMethod;

public class ExtratoContaCorrente implements Extrato{
    @Override
    public String emitir() {
        return "Extrato de conta corrente";
    }
}
