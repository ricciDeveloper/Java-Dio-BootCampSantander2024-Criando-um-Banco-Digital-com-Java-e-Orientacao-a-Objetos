package OrientaçãoObjetosExercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();


        List<String> transacoes = new ArrayList<>();

        for (int i = 0; i< quantidadeTransacoes; i++){
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                // TODO: Adicione a transação à lista:
                transacoes.add("Deposito de " +valorTransacao);

            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                saldo -= valorTransacao;
                // TODO: Adiciona a transação à lista
                transacoes.add("Saque de " +valorTransacao);

            } else {

                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }


        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

        // TODO: Crie um loop 'for' para exibir cada transação na lista:
        for (int i = 0; i < transacoes.size(); i++){
            // TODO: Agora exibA o número da transação seguido da descrição da transação:
            System.out.println((i+1)+" "+transacoes.get(i));
        }


        scanner.close();
    }
}
