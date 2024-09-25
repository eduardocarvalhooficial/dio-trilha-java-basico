import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldoConta = scanner.nextDouble();

        cliente.setNome(nomeCliente);
        ContaTerminal terminal = new ContaTerminal(numeroConta,numeroAgencia,cliente,saldoConta);

        terminal.exibirMensagemDeBoasVindas();

        scanner.close();

    }
}
