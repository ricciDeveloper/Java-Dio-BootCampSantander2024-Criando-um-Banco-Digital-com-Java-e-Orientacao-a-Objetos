
public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNomeCliente("Joao");

        Conta cc = new ContaCorrente(joao);
        Conta poup = new ContaPoupanca(joao);
        cc.imprimirInfosComuns();
        poup.imprimirExtrato();
        cc.depositar(150);
        cc.transferir(100,poup);
        cc.imprimirInfosComuns();
        poup.imprimirExtrato();


        Cliente stella = new Cliente();
        stella.setNomeCliente("Stella");

        Conta cc1 = new ContaCorrente(stella);
        Conta poup1 = new ContaPoupanca(stella);
        cc1.imprimirInfosComuns();
        poup1.imprimirExtrato();
        cc1.depositar(2000);
        cc1.transferir(1020,poup1);
        cc1.imprimirInfosComuns();
        poup1.imprimirExtrato();
    }
}