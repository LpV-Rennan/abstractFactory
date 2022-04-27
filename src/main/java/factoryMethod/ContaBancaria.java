package factoryMethod;

public class ContaBancaria {
    private Deposito deposito;
    private Extrato extrato;
    private Saque saque;

    public ContaBancaria(FabricaAbstrata fabrica){
        this.deposito = fabrica.createDeposito();
        this.extrato = fabrica.createExtrato();
        this.saque = fabrica.createSaque();
    }

    public String efetuarSaque(){
        return this.saque.efetuarSaque();
    }
    public String emitirExtrato(){
        return this.extrato.emitir();
    }
    public String depositar(){
        return this.deposito.depositar();
    }
}
