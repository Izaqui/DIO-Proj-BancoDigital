import java.util.Scanner;
import dominios.Cliente;
import dominios.Conta;
import dominios.ContaCorrente;
import dominios.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.setName("cliente");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(0);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Transferir da conta corrente para a poupança");
            System.out.println("2. Realizar um depósito na conta corrente");
            System.out.println("3. Imprimir extrato da conta corrente");
            System.out.println("4. Imprimir extrato da conta poupança");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser transferido da conta corrente para a poupança:");
                    double valorTransferencia = scanner.nextDouble();
                    if (cc.getSaldo() >= valorTransferencia) {
                        cc.transferir(valorTransferencia, poupanca);
                    } else {
                        System.out.println("Saldo insuficiente na conta corrente para realizar a transferência.");
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado na conta corrente:");
                    double valorDeposito = scanner.nextDouble();
                    cc.depositar(valorDeposito);
                    break;
                case 3:
                    cc.printInfo();
                    break;
                case 4:
                    poupanca.printInfo();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
