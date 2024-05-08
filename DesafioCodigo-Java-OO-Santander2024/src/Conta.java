public class Conta implements  IConta{
    private static int SEQUENCIAL= 1;
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected double saldo;
    protected int numero;
    protected Cliente cliente;

    public Conta (Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL;
        this.cliente = cliente;
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        imprimirInfosComuns();
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", cliente.getNomeCliente()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }



}
